package com.lucas.turbomotors.car;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public List<CarResponseDTO> getCars() {
        List<CarResponseDTO> carList = carRepository.findAll().stream().map(CarResponseDTO::new).toList();
        return carList;
    }

    @GetMapping("2")
    public List<Car> getCars2() {
        List<Car> carList = carRepository.findAll();
        return carList;
    }

    // Todo: Implement the rest of the endpoints (POST, PUT, DELETE)

}
