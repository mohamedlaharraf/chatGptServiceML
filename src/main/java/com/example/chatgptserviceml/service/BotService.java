package com.example.chatgptserviceml.service;

import com.example.chatgptserviceml.model.request.BotRequest;
import com.example.chatgptserviceml.model.response.ChatGptResponse;

public interface BotService {

    ChatGptResponse askQuestion(BotRequest botRequest);
}
