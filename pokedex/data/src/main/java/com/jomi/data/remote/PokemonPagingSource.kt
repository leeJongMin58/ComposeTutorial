package com.jomi.data.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.jomi.data.entity.PokemonEntity
import com.jomi.data.remote.api.PokemonApi
import com.jomi.data.remote.mapper.PokemonMapper

class PokemonPagingSource(
    private val pokemonApi: PokemonApi,
    private val pokemonMapper: PokemonMapper,
    private val limit: Int
): PagingSource<Int, PokemonEntity>() {
    override fun getRefreshKey(state: PagingState<Int, PokemonEntity>): Int? =
        state.anchorPosition

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, PokemonEntity> =
        try{
            val nextPage = params.key ?:0
            val data = pokemonApi.getPokemonList(limit, nextPage).let {
                pokemonMapper.fromResponse(it)
            }
            LoadResult.Page(
                data = data,
                prevKey = if (nextPage == 0) null else nextPage - limit,
                nextKey = if (data.isEmpty()) null else nextPage + limit
            )
        } catch (e: Exception){
            LoadResult.Error(e)
        }
}
