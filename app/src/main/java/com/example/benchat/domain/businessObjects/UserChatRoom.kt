package com.example.benchat.domain.businessObjects

import java.util.Date
import java.util.UUID

data class UserChatRoom (
    val userChatId: UUID,
    val userId: UUID,
    val chatRoomId: UUID,
    val joinedAt: Date,
)