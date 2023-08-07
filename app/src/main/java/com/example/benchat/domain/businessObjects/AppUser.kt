package com.example.benchat.domain.businessObjects

import java.util.Date
import java.util.UUID

data class AppUser(
    var userId: UUID = UUID.randomUUID(),
    val userName: String,
    val email: String,
    val profilePicture: String,
    val createdAt: Date

)