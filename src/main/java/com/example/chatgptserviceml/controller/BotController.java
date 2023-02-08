package com.example.chatgptserviceml.controller;

import com.example.chatgptserviceml.model.request.BotRequest;
import com.example.chatgptserviceml.model.response.ChatGptResponse;
import com.example.chatgptserviceml.model.response.Choice;
import com.example.chatgptserviceml.service.BotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BotController {

    private final BotService botService;

    @PostMapping("/send")
    public ChatGptResponse sendMessage(@RequestBody BotRequest botRequest) {

        String requestText = botRequest.getMessage();
        String responseText = botService.askQuestion(botRequest).getChoices().get(0).getText();
        System.out.println(requestText + ";" + responseText);

        return botService.askQuestion(botRequest);
    }
}



