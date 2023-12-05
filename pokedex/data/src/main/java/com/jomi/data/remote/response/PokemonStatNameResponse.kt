package com.jomi.data.remote.response

import com.squareup.moshi.Json

data class PokemonStatNameResponse(
    @field:Json(name = "name")
    val statName: String
)
