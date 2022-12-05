package com.infinitumcode.mymovieapp.data

//Menentukan animasi yang telah ditetapkan
data class Resource<out T> (
        val status: Status,
        val data: T?,
        val error: Throwable?
)