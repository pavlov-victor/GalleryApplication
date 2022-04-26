package com.example.galleryapplication

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class GalleryViewModel(application: Application) : AndroidViewModel(application) {
    fun helloWorld() {
        Log.d("ViewModel", "Hello from logger")
    }
}


class GalleryViewModelFactory(private val application: Application): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GalleryViewModel(application = application) as T
    }
}
