package com.sistemaestoque.api.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("your.mail.host.com"); // Configurar o host do servidor de e-mail
        mailSender.setPort(587); // Configurar a porta do servidor de e-mail
        mailSender.setUsername("your-email@example.com"); // Configurar o nome de usuário do e-mail
        mailSender.setPassword("your-email-password"); // Configurar a senha do e-mail
        
        return mailSender;
    }
}