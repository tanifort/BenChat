package com.example.benchat.domain.interfaces

interface ILocalStorageService {
    suspend fun  saveData(key: String, value:String);
    suspend fun   getData(key: String)
    suspend fun  removeData(key: String)
}