package com.test_task_resliv.tourist_hint_bot;

import com.test_task_resliv.tourist_hint_bot.bot.TouristHintBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@SpringBootApplication
public class TouristHintBotApplication {

	public static void main(String[] args) {

		ApiContextInitializer.init();

		TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

		try {
			telegramBotsApi.registerBot(new TouristHintBot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
		SpringApplication.run(TouristHintBotApplication.class, args);
	}

}
