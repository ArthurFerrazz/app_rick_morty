package com.arthur.myapplication

import com.arthur.myapplication.model.Character
import com.arthur.myapplication.model.Pagination

data class CharactersRequest(
    val info: Pagination,
    val results: List<Character>,
    val detailCharacter: Character,
)
