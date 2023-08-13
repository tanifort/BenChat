package com.example.benchat.domain.interfaces

import kotlinx.coroutines.flow.Flow


interface ILocalStorage<TKey, T> {
    fun insert(key: TKey, data: T) : Flow<Int>
    fun get(key: TKey): Flow<T>
    fun clearAll(): Flow<Int>

}