package com.kpo.emailer.app.dto

data class EmailRequest(
    val receiver: String,
    val topic: String,
    val text: String,
    val filename: String
)