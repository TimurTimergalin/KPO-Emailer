package com.kpo.emailer.app.controller

import com.kpo.emailer.api.dto.EmailRequest
import com.kpo.emailer.api.EmailerApi
import com.kpo.kpoemailerlogic.EmailServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController()
class EmailerController : EmailerApi {

    @Autowired
    private lateinit var service: EmailServiceImpl
    @PostMapping("/send")
    override fun sendEmail(@RequestBody request: EmailRequest) {
        service.sendMessage(request.receiver, request.topic, request.text, request.filename)
    }
}