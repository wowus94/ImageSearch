package com.vlyashuk.imagesearch.ui.gallery

import androidx.lifecycle.ViewModel
import com.vlyashuk.imagesearch.data.UnsplashRepository
import javax.inject.Inject

class GalleryViewModel @Inject constructor(
    private val repository: UnsplashRepository
) : ViewModel() {
}