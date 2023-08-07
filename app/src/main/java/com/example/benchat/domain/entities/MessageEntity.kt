package com.example.benchat.domain.entities

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.util.Date
import java.util.UUID
@Serializable
data class MessageEntity(
    @SerializedName("message_id")
    @Contextual
    val messageId: UUID,
    @SerializedName("chat_room_id")
    @Contextual
    val chatRoomId: UUID,
    @SerializedName("sender_id")
    @Contextual
    val senderId: UUID,
    @SerializedName("message_text")
    val messageText: String,
    @SerializedName("sent_at")
    @Contextual
    val sentAt: Date

)