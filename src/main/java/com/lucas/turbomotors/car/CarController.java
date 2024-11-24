package com.lucas.turbomotors.car;


import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/2")
    public List<Car> getCars2() {
        List<Car> carList = carRepository.findAll();
        return carList;
    }

    @PostMapping
    public CarResponseDTO createCar(@RequestBody CarRequestDTO data){
        Car carData = new Car(data);
        carRepository.save(carData);

        return new CarResponseDTO(carData);
    }

    @PutMapping("/{id}")
    public CarResponseDTO updateCar(@RequestBody CarRequestDTO data, @PathVariable("id") Long id) {
        Optional<Car> carOptional = carRepository.findById(id);
        if (!carOptional.isPresent()) {
            throw new IllegalStateException("Car not found");
        }

        Car updatedCar = carOptional.get();
        BeanUtils.copyProperties(data, updatedCar);
        carRepository.save(updatedCar);

        return new CarResponseDTO(updatedCar);
    }

    @DeleteMapping("/{id}")
    public CarResponseDTO deleteCar(@PathVariable("id") Long id) {
        Optional<Car> carOptional = carRepository.findById(id);
        if (!carOptional.isPresent()) {
            throw new IllegalStateException("Car not found");
        }
        carRepository.deleteById(id);

        return new CarResponseDTO(carOptional.get());
    }

}
