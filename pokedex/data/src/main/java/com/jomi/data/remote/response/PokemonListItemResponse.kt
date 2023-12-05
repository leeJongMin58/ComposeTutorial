package com.jomi.data.remote.response

import com.squareup.moshi.Json

data class PokemonListItemResponse(
    @field:Json(name = "name")
    val name: String,

    @field:Json(name = "url")
    val url: String
) {
    val id: Int
        get() = url.split("/").dropLast(1).last().toInt()
}
