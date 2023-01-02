package com.qa.nasmita.qa_checking_bot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class BotConfig {

    @Value("${bot.name}")
    private String botName;

    @Value("${bot.key}")
    private String token;
}
