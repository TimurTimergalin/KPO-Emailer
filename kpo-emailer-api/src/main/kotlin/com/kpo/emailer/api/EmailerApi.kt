package com.kpo.emailer.api

import com.kpo.com.kpo.emailer.api.dto.EmailRequest

interface EmailerApi {
    fun sendEmail(request: EmailRequest)
}