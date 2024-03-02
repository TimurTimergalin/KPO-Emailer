package com.kpo.com.kpo.emailer.api.dto

data class EmailRequest(
    val receiver: String,
    val topic: String,
    val text: String,
    val filename: String
)
