package com.jomi.domain.usecase

import com.jomi.domain.repository.PokemonRepository
import javax.inject.Inject

class GetPokemonListUseCase @Inject constructor(
    private val repository: PokemonRepository
) {
    operator fun invoke(limit: Int) =
        repository.getPokemonPagingSource(limit)
}
