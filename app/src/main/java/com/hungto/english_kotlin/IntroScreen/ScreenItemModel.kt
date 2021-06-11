package com.hungto.english_kotlin.IntroScreen

import lombok.AllArgsConstructor
import lombok.Getter
import lombok.Setter

@Getter
@Setter
@AllArgsConstructor
data class ScreenItemModel(
    val title: String?,
    val description: String?,
    val screenImage: Int?
)