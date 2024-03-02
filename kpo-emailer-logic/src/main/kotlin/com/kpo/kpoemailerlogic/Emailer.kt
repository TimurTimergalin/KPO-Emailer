package com.kpo.kpoemailerlogic

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.core.io.FileSystemResource
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.stereotype.Component
import java.awt.SystemColor
import java.io.File


@Bean
fun getJavaMailSender(): JavaMailSender {
    val mailSender = JavaMailSenderImpl()
    mailSender.host = "smtp.gmail.com"
    mailSender.port = 587

    mailSender.username = "my.gmail@gmail.com"
    mailSender.password = "password"

    val props = mailSender.javaMailProperties
    props["mail.transport.protocol"] = "smtp"
    props["mail.smtp.auth"] = "true"
    props["mail.smtp.starttls.enable"] = "true"
    props["mail.debug"] = "true"

    return mailSender
}

@Component
class EmailServiceImpl {
    @Autowired
    private lateinit var emailSender: JavaMailSender

    fun sendSimpleMessage(
        to: String, subject: String, text: String, filename: String) {
        val message = emailSender.createMimeMessage()

        val helper = MimeMessageHelper(message, true)

        helper.setFrom("com.kpo")
        helper.setTo(to)
        helper.setSubject(subject)
        val file = FileSystemResource(File(filename))
        helper.addAttachment("Student list", file)

        emailSender.send(message)
    }
}