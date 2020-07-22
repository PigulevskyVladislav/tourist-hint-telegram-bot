package com.test_task_resliv.tourist_hint_bot.exception;

public class CityNotFoundException extends RuntimeException {

    public CityNotFoundException(Long id) {
        super("Could not find city " + id);
    }
}
