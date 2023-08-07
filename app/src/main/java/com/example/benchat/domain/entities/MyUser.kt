package com.example.benchat.domain.entities

import com.parse.ParseClassName
import com.parse.ParseObject

@ParseClassName("User")
class MyUser: ParseObject() {
    var id : String
        get() = getString("objectId")?: ""
        set(value) = put("objectId", value)

    var userName : String
        get() = getString("username")?: ""
        set(value) = put("username", value)

    var email : String
        get() = getString("email")?: ""
        set(value) = put("email", value)
}