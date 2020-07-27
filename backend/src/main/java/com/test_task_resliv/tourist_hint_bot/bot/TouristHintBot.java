package com.test_task_resliv.tourist_hint_bot.bot;

import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TouristHintBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {

        Message inputMessage = update.getMessage();
        SendMessage outputMessage = new SendMessage();
        outputMessage.setChatId(inputMessage.getChatId());
        outputMessage.setText(getHintByName(inputMessage.getText()));

        try {
            execute(outputMessage);
        } catch (TelegramApiException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String getBotUsername() {
        return "tourist_hint_telegram_bot";
    }

    @Override
    public String getBotToken() {
        return "1355450414:AAEszl0etR782pNjQ_bKy3hs_L3w-oSZ_Io";
    }

    private static String getHintByName(String name)
    {
        name = name.toLowerCase().trim();

        final String uri = "http://localhost:8080/cities/name/".concat(name);

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        if (result == null) { return "К сожалению, я не знаю такого города"; }

        return result;
    }
}
