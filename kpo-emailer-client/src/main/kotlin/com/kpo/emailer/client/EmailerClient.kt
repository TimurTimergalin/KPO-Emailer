package com.kpo.emailer.client

import com.kpo.emailer.api.dto.EmailRequest
import com.kpo.emailer.api.EmailerApi
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(name = "emailer", url = "{url}") // TODO: url injection
interface EmailerClient : EmailerApi {

    @PostMapping("/send")
    override fun sendEmail(@RequestBody request: EmailRequest)
}