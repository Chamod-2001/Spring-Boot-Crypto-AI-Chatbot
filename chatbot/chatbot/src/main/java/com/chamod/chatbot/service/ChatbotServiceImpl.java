package com.chamod.chatbot.service;

import com.chamod.chatbot.dto.CoinDto;
import com.chamod.chatbot.response.ApiResponse;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;

@Service
public class ChatbotServiceImpl implements ChatbotService{

    public CoinDto makeApiRequest(String currencyName){
        String url = "https://api.coingecko.com/api/v3/coins/bitcoin";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        return null;

    }

    @Override
    public ApiResponse getCoinDetails(String prompt) {
        return null;
    }

    @Override
    public String simpleChat(String prompt) {
        return "";
    }
}
