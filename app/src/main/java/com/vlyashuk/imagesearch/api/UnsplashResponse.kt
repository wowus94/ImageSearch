package com.vlyashuk.imagesearch.api

import com.vlyashuk.imagesearch.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)