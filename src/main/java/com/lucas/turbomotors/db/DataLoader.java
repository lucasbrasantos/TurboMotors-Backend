package com.lucas.turbomotors.db;


import com.lucas.turbomotors.car.Car;
import com.lucas.turbomotors.car.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    private List<Car> carList = List.of(
            new Car(null, "A powerful sports car with a 5.2 V5.3 engine", "Ford", "Mustang", "Red", "5.4", "Gasoline"),
            new Car(null, "A luxury SUV with advanced features", "Audi", "Q5.5", "Black", "5.6", "Diesel"),
            new Car(null, "A reliable and compact sedan", "Toyota", "Corolla", "White", "5.7", "Hybrid"),
            new Car(null, "A stylish electric car with impressive range", "Tesla", "Model 5.8", "Blue", "5.9", "Electric"),
            new Car(null, "An off-road vehicle built for adventure", "Jeep", "Wrangler", "Green", "6.0", "Gasoline"),
            new Car(null, "A high-performance sports coupe", "BMW", "M6.1", "Yellow", "6.2", "Gasoline"),
            new Car(null, "A family-friendly minivan with modern amenities", "Honda", "Odyssey", "Silver", "6.3", "Gasoline"),
            new Car(null, "A compact and efficient hatchback", "Volkswagen", "Golf", "Gray", "6.4", "Gasoline"),
            new Car(null, "An elegant and powerful luxury sedan", "Mercedes-Benz", "E-Class", "White", "6.5", "Gasoline"),
            new Car(null, "A rugged and durable pickup truck", "Chevrolet", "Silverado", "Black", "6.6", "Diesel")
    );

    @Override
    public void run(String... args) throws Exception {
        carRepository.saveAll(carList);
    }
}
