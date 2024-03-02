package com.kpo.emailer.api

import com.kpo.emailer.api.dto.EmailRequest

interface EmailerApi {
    fun sendEmail(request: EmailRequest)
}