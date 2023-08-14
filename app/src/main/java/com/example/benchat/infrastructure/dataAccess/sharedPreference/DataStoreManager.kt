package com.example.benchat.infrastructure.dataAccess.sharedPreference
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import io.ktor.utils.io.errors.IOException
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import javax.inject.Inject

private const val USER_PREFERENCES = "user_preferences"
class DataStoreManager @Inject constructor(@ApplicationContext private val context: Context)  {

    private val Context.dataStore : DataStore<Preferences> by preferencesDataStore(USER_PREFERENCES)

    private suspend fun <T> DataStore<Preferences>.getFromLocalStorage(
        preferencesKey: Preferences.Key<T>, func: T.() -> Unit){
        data.catch {
            if(it is IOException) {
                emit(emptyPreferences())
            }else {
                throw it
            }
        }.map {
            it[preferencesKey]
        }.collect{
            it?.let { func.invoke(it as T) }
        }
    }

    suspend fun <T> storeValue(key: Preferences.Key<T>, value: T) {
        context.dataStore.edit {
            it[key] = value
        }
    }

    suspend fun <T> readValue(key: Preferences.Key<T>, responseFunc: T.() -> Unit) {
        context.dataStore.getFromLocalStorage(key) {
            responseFunc.invoke(this)
        }
    }

}