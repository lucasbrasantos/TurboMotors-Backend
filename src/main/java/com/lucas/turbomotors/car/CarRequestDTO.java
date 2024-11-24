package com.lucas.turbomotors.car;

public record CarRequestDTO (Long id, String description, String brand, String model, String color, String year,
                             String fuelType) {
}
