package com.jomi.domain.di

import com.jomi.domain.repository.PokemonRepository
import com.jomi.domain.usecase.GetPokemonListUseCase
import com.jomi.domain.usecase.GetPokemonUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideGetPokemonListUseCase(
        pokemonRepository: PokemonRepository
    ): GetPokemonListUseCase = GetPokemonListUseCase(pokemonRepository)

    @Provides
    @Singleton
    fun provideGetPokemonUseCase(
        pokemonRepository: PokemonRepository
    ): GetPokemonUseCase = GetPokemonUseCase(pokemonRepository)
}
