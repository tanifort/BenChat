package com.example.benchat.infrastructure.dataAccess

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.example.benchat.domain.interfaces.ILocalStorage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

private const val EMPTY_JSON_STRING = "[]";
private const val NOT_FOUND = "NOT_FOUND";
const val OPERATION_SUCCESSFUL = 0

  class TextLocalStorage constructor(
    private val dataStore: DataStore<Preferences>, // use Context ??
): ILocalStorage<String, String> {
      override fun insert(key: String, data: String): Flow<Int> {
          println("LOCAL_STORAGE INSERT START")
          val k = stringPreferencesKey(key)
       return   flow {
              dataStore.edit { preferences ->
                  preferences[k]= data;
                  println("LOCAL_STORAGE INSERT")
                    emit(OPERATION_SUCCESSFUL)
              }
          }

      }

      override fun get(key: String): Flow<String> {
          val k = stringPreferencesKey(key)
          return flow { dataStore.data.map {prefs: Preferences ->

                    prefs[k]?: NOT_FOUND

          } }
      }

      override fun clearAll(): Flow<Int> {
          TODO("Not yet implemented")
      }


  }