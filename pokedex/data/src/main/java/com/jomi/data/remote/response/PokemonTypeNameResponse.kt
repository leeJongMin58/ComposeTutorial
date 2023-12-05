package com.jomi.data.remote.response

import com.squareup.moshi.Json

data class PokemonTypeNameResponse(
    @field:Json(name = "name")
    val name: String
)
