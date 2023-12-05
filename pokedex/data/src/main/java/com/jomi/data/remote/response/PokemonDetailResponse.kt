package com.jomi.data.remote.response

import com.squareup.moshi.Json

data class PokemonDetailResponse(
    @field:Json(name = "id")
    val id: Int,

    @field:Json(name = "name")
    val name: String,

    @field:Json(name = "height")
    val height: Int,

    @field:Json(name = "weight")
    val weight: Int,

    @field:Json(name = "stats")
    val stats: List<PokemonStatResponse>,

    @field:Json(name = "types")
    val types: List<PokemonTypeResponse>
)
