package com.lucas.turbomotors.car;

public record CarRequestDTO (String description, String brand, String model, String color, String year,
                             String fuelType) {
}
