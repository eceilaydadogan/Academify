package com.example.my.tabs

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class FavoriViewModel : ViewModel() {
    private val _favoriCourses = MutableStateFlow<Set<String>>(setOf())
    val favoriCourses: StateFlow<Set<String>> = _favoriCourses.asStateFlow()

    fun toggleFavoriCourse(courseCode: String) {
        val updatedSet = _favoriCourses.value.toMutableSet()
        if (updatedSet.contains(courseCode)) {
            updatedSet.remove(courseCode)
        } else {
            updatedSet.add(courseCode)
        }
        _favoriCourses.value = updatedSet
    }
}


