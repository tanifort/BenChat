package com.example.benchat.domain.interfaces

import kotlinx.coroutines.flow.Flow

interface IRepository<TKey, TEntity>{
   suspend fun delete(key: TKey)
   suspend fun getById(key: TKey):TEntity
   suspend fun add(entity: TEntity)
   suspend fun get(where:()-> Unit): Flow<TEntity>
   suspend fun update(entity: TEntity): Flow<TEntity>
}