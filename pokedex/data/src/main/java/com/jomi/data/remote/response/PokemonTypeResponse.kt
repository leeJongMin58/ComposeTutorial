package com.jomi.data.remote.response

import com.squareup.moshi.Json

data class PokemonTypeResponse(
    @field:Json(name = "type")
    val type: PokemonTypeNameResponse,
)
