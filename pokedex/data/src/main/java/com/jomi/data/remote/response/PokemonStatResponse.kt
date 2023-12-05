package com.jomi.data.remote.response

import com.squareup.moshi.Json

data class PokemonStatResponse(
    @field:Json(name = "base_stat")
    val baseStat: Int,

    @field:Json(name = "stat")
    val stat: PokemonStatNameResponse,
)
