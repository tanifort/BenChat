package com.example.benchat.domain.businessObjects

import java.util.Date
import java.util.UUID

data class Message(
    val messageId: UUID,
    val chatRoomId: UUID,
    val senderId: UUID,
    val messageText: String,
    val sentAt: Date

    )