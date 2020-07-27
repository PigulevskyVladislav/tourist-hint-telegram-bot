package com.test_task_resliv.tourist_hint_bot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test_task_resliv.tourist_hint_bot.entity.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "SELECT * FROM city ORDER BY city_name ASC;", nativeQuery = true)
    List<City> findAll();

    @Query(value = "SELECT hint FROM city WHERE city_name = :CityName ;", nativeQuery = true)
    String getHintByName(@Param("CityName") String name);
}
