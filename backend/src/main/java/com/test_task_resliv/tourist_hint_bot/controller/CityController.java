package com.test_task_resliv.tourist_hint_bot.controller;

import com.test_task_resliv.tourist_hint_bot.repository.CityRepository;
import com.test_task_resliv.tourist_hint_bot.entity.City;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CityController {

    private final CityRepository repository;

    CityController(CityRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin
    @GetMapping("/cities")
    List<City> all() {
        return repository.findAll();
    }

    @CrossOrigin
    @DeleteMapping("/cities/{id}")
    void deleteCity(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
