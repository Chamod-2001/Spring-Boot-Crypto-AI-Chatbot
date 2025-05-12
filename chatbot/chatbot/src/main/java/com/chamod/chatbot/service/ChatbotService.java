package com.chamod.chatbot.service;

import com.chamod.chatbot.response.ApiResponse;

public interface ChatbotService {

    ApiResponse getCoinDetails(String prompt);

    String simpleChat(String prompt);
}
