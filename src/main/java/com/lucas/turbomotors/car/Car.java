package com.lucas.turbomotors.car;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String brand;
    private String model;
    private String color;
    private String year;
    private String fuelType;

    public Car(CarRequestDTO data){
        this.description = data.description();
        this.brand = data.brand();
        this.model = data.model();
        this.color = data.color();
        this.year = data.year();
        this.fuelType = data.fuelType();
    }
}
