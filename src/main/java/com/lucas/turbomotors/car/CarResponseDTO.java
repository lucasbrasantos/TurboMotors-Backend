package com.lucas.turbomotors.car;

public record CarResponseDTO (String description, String brand, String model, String color, String year, String fuelType){
    public CarResponseDTO(Car car) {
        this(car.getDescription(), car.getBrand(), car.getModel(), car.getColor(), car.getYear(), car.getFuelType());
    }
}
