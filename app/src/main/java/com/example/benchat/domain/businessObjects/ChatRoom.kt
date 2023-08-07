package com.example.benchat.domain.businessObjects

import java.util.Date
import java.util.UUID

data class ChatRoom (
    val chatRoomId: UUID,
    val chatRoomName: String,
    val createdAt: Date
)