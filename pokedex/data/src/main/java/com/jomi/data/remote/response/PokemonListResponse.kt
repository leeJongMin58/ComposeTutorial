package com.jomi.data.remote.response

import com.squareup.moshi.Json

data class PokemonListResponse(
    @field:Json(name = "results")
    val results: List<PokemonListItemResponse>
)
