package com.example.benchat.infrastructure.dataAccess.base

import android.app.Application
import com.example.benchat.domain.interfaces.IRepository
import com.parse.Parse
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

abstract class BaseRepository<TKey, TEntity> @Inject constructor(
      application: Application,
  private val parse: Parse): IRepository<TKey, TEntity> {
    override suspend fun delete(key: TKey) {

        TODO("Not yet implemented")
    }

    override suspend fun getById(key: TKey): TEntity {
        TODO("Not yet implemented")
    }

    override suspend fun add(entity: TEntity) {
        TODO("Not yet implemented")
    }

    override suspend fun get(where: () -> Unit): Flow<TEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun update(entity: TEntity): Flow<TEntity> {
        TODO("Not yet implemented")
    }
}