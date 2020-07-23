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
//        try {
//            System.out.println(repository.findAll());
//            System.out.println("Lol!");
//        } catch (Exception ex) {
//            System.out.println("!!!" + ex.getMessage());
//            System.out.println("Lol!");
//        }
        return repository.findAll();
    }
}
