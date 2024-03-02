package com.kpo.emailer.api.dto

data class EmailRequest(
    var receiver: String,
    var topic: String,
    var text: String,
    var filename: String
)
