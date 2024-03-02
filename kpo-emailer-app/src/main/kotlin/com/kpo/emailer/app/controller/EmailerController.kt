package com.kpo.emailer.app.controller

import com.kpo.com.kpo.emailer.api.dto.EmailRequest
import com.kpo.emailer.api.EmailerApi
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EmailerController : EmailerApi {

    // TODO: logic service
    @PostMapping
    override fun sendEmail(@RequestBody request: EmailRequest) {
        // TODO: logic
    }
}