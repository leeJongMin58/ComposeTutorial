package com.jomi.domain.repository

import androidx.paging.PagingData
import com.jomi.data.entity.PokemonDetailEntity
import com.jomi.data.entity.PokemonEntity
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {
    fun getPokemonPagingSource(
        limit: Int,
    ): Flow<PagingData<PokemonEntity>>

    suspend fun getPokemonDetail(name: String): PokemonDetailEntity
}
