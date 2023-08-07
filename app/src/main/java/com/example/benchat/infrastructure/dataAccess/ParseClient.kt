package com.example.benchat.infrastructure.dataAccess

import com.example.benchat.BenChatApplication
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ParseClient
@Inject constructor(
    private val app: BenChatApplication,
) {


}