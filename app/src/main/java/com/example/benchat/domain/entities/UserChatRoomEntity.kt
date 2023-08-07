package com.example.benchat.domain.entities

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.util.Date
import java.util.UUID

@Serializable
data class UserChatRoomEntity (
    @SerializedName("id")
    @Contextual
    val userChatId: UUID,
    @SerializedName("user_id")
    @Contextual
    val userId: UUID,
    @SerializedName("chat_room_id")
    @Contextual
    val chatRoomId: UUID,
    @SerializedName("joined_at")
    @Contextual
    val joinedAt: Date,
)