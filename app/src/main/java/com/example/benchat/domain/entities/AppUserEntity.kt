package com.example.benchat.domain.entities

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.util.Date
import java.util.UUID


@Serializable
data class AppUserEntity(
    @SerializedName("user_id")
    @Contextual
    val userId: UUID,
    @SerializedName("username")
    val username: String?,
    @SerializedName("email")
    val email: String,
    @SerializedName("profile_pic")
    val profilePicture: String,
    @SerializedName("created_at")
    //@Serializable(with = DateSerializer::class)
    @Contextual
    var createdAt: Date

)