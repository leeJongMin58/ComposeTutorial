package com.jomi.data.remote.repositoryimpl

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.jomi.data.entity.PokemonDetailEntity
import com.jomi.data.entity.PokemonEntity
import com.jomi.data.remote.PokemonPagingSource
import com.jomi.data.remote.api.PokemonApi
import com.jomi.data.remote.mapper.PokemonMapper
import com.jomi.domain.repository.PokemonRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RemotePokemonRepositoryImpl @Inject constructor(
    private val pokemonApi: PokemonApi,
    private val pokemonMapper: PokemonMapper
): PokemonRepository {
    override fun getPokemonPagingSource(limit: Int): Flow<PagingData<PokemonEntity>> =
        Pager(config = PagingConfig(50)
        ) {
            PokemonPagingSource(pokemonApi, pokemonMapper, limit)
        }.flow

    override suspend fun getPokemonDetail(name: String): PokemonDetailEntity =
        pokemonMapper.fromResponse(pokemonApi.getPokemonDetail(name))
}
