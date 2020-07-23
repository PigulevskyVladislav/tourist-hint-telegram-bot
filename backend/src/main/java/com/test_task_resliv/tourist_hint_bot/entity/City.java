package com.test_task_resliv.tourist_hint_bot.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "city")
public class City {

    private @Id @GeneratedValue Long city_id;
    private @Column(name="city_name") String name;
    private String hint;

    public City() { }

    public City(String name, String hint) {
        this.name = name;
        this.hint = hint;
    }

    public Long getId() {
        return city_id;
    }

    public String getName() {
        return name;
    }

    public String getHint() {
        return hint;
    }

    public void setId(Long city_id) {
        this.city_id = city_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof City)) return false;
        City city = (City) o;
        return hashCode() == city.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.city_id, this.name, this.hint);
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + this.city_id + '\'' +
                ", name='" + this.name + '\'' +
                ", hint='" + this.hint + '\'' +
                '}';
    }
}
