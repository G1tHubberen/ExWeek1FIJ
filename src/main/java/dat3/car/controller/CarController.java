package dat3.car.controller;

import dat3.car.entity.Car;
import dat3.car.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarRepository carRepository;

    @Autowired
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping
    // Accessible by: Anonymous, USER, ADMIN
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    // Accessible by: Anonymous, ADMIN, USER
    public Car getCarById(@PathVariable UUID id) {
        return carRepository.findById(id).orElse(null);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Car createCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Car updateCar(@PathVariable UUID id, @RequestBody Car updatedCar) {
        Optional<Car> existingCar = carRepository.findById(id);

        if (existingCar.isPresent()) {
            Car car = existingCar.get();
            car.setBrand(updatedCar.getBrand());
            car.setModel(updatedCar.getModel());
            car.setPricePrDay(updatedCar.getPricePrDay());
            car.setBestDiscount(updatedCar.getBestDiscount());
            car.setLastEdited(updatedCar.getLastEdited());
            car.setCreated(updatedCar.getCreated());
            return carRepository.save(car);
        } else {
            return null; // Car with given ID not found
        }
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteCar(@PathVariable UUID id) {
        carRepository.deleteById(id);
    }
}
