package com.jomi.domain.usecase

import com.jomi.data.entity.PokemonDetailEntity
import com.jomi.domain.repository.PokemonRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetPokemonUseCase @Inject constructor(
    private val repository: PokemonRepository
) {
    suspend operator fun invoke(name: String):PokemonDetailEntity =
        withContext(Dispatchers.IO){
            repository.getPokemonDetail(name)
        }
}
