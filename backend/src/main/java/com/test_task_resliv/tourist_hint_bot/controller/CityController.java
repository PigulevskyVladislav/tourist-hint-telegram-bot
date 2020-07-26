package com.test_task_resliv.tourist_hint_bot.controller;

import com.test_task_resliv.tourist_hint_bot.exception.CityNotFoundException;
import com.test_task_resliv.tourist_hint_bot.repository.CityRepository;
import com.test_task_resliv.tourist_hint_bot.entity.City;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


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
    @GetMapping("/cities/{id}")
    City one(@PathVariable Long id) {
        return repository.findById(id)
         .orElseThrow(() -> new CityNotFoundException(id));
    }


//    City createCity(@PathVariable City newCity) {
//        return repository.save(newCity);
//    }
    @CrossOrigin
    @PostMapping("/cities")
    City createCity(@RequestBody Map<String, String> params) {
        return repository.save(new City(
                params.get("name"),
                params.get("hint")
        ));
    }

    @CrossOrigin
    @PutMapping("/cities/{id}")
    City updateCity(@RequestBody Map<String, String> params,
                    @PathVariable Long id) {

        return repository.findById(id)
                .map(city -> {
                    city.setName(params.get("name"));
                    city.setHint(params.get("hint"));
                    return repository.save(city);
                })
                .orElseGet(() -> {
                    City newCity = new City(
                            params.get("name"),
                            params.get("hint")
                    );
                    newCity.setId(id);
                    return newCity;
                });
    }

    @CrossOrigin
    @DeleteMapping("/cities/{id}")
    void deleteCity(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
