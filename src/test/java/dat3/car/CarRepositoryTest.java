package dat3.car;

import dat3.car.entity.Car;
import dat3.car.repositories.CarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class CarRepositoryTest {

    @Autowired
    private CarRepository carRepository;

    @Test
    public void testSaveAndFindById() {
        Car car = new Car("Toyota", "Corolla", 50.0, 10);
        carRepository.save(car);

        Car foundCar = carRepository.findById(car.getId()).orElse(null);
        assertThat(foundCar).isNotNull();
        assertThat(foundCar.getBrand()).isEqualTo("Toyota");
        assertThat(foundCar.getModel()).isEqualTo("Corolla");
        assertThat(foundCar.getPricePrDay()).isEqualTo(50.0);
        assertThat(foundCar.getBestDiscount()).isEqualTo(10);
    }

    @Test
    public void testFindAll() {
        Car car1 = new Car("Toyota", "Corolla", 50.0, 10);
        Car car2 = new Car("Honda", "Civic", 45.0, 8);
        carRepository.saveAll(List.of(car1, car2));

        List<Car> cars = carRepository.findAll();
        assertThat(cars).hasSize(2);
    }

    @Test
    public void testUpdate() {
        Car car = new Car("Toyota", "Corolla", 50.0, 10);
        carRepository.save(car);

        car.setBrand("Nissan");
        carRepository.save(car);

        Car updatedCar = carRepository.findById(car.getId()).orElse(null);
        assertThat(updatedCar).isNotNull();
        assertThat(updatedCar.getBrand()).isEqualTo("Nissan");
    }

    @Test
    public void testDelete() {
        Car car = new Car("Toyota", "Corolla", 50.0, 10);
        carRepository.save(car);

        carRepository.delete(car);

        Car deletedCar = carRepository.findById(car.getId()).orElse(null);
        assertThat(deletedCar).isNull();
    }
}

