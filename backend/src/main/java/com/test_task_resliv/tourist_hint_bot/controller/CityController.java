package com.test_task_resliv.tourist_hint_bot.controller;

import com.test_task_resliv.tourist_hint_bot.repository.CityRepository;
import com.test_task_resliv.tourist_hint_bot.entity.City;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@RestController
public class CityController {

    private final CityRepository repository;

    CityController(CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cities")
    List<City> all() {
        return repository.findAll();
    }
}
