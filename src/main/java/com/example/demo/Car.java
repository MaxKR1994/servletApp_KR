package com.example.demo;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class Car {

    private int id;
    private String brand;
    private String model;
    private String producingCountry;
    private String bodyType;
    private Boolean isDeletedCar = false;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", producingCountry='" + producingCountry + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", isDeletedCar=" + isDeletedCar +
                '}';
    }
}

