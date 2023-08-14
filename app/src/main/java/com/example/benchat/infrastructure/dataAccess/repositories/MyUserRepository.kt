package com.example.benchat.infrastructure.dataAccess.repositories

import com.parse.ParseQuery
import javax.inject.Inject

class MyUserRepository @Inject constructor() {

    fun getAllUsers(): List<MyUser>{
        val query = ParseQuery.getQuery<MyUser>("User");
        return query.find();
    }

    fun saveUser( user: MyUser){
        user.save();
    }

    fun deleteUser(user: MyUser){
        user.delete();
    }
}