package com.example.benchat.domain.entities

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.util.Date
import java.util.UUID


@Serializable
data class ChatRoomEntity(
    @SerializedName("room")
    @Contextual
    val chatRoomId: UUID,
    @SerializedName("chat_room_name")
    val chatRoomName: String,
    @SerializedName("created_at")
    @Contextual
    val createdAt: Date
)