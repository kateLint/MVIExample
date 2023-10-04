package com.compose.mviexample.api

class AnimalRepo (private val api: AnimalApi){
    suspend fun getAnimal() = api.getAnimals()
}