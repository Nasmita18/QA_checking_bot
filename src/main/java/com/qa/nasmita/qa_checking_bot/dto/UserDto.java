package com.qa.nasmita.qa_checking_bot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private long chatId;

    private String selectedQuestion;

    private String answerToSelectedQuestion;

    Map<String, String> questAnswerMap;

}
