package com.test_task_resliv.tourist_hint_bot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test_task_resliv.tourist_hint_bot.entity.City;

public interface CityRepository extends JpaRepository<City, Long> {

}
