package dat3.car.config;

import dat3.car.entity.Car;
import dat3.car.repositories.CarRepository;
import dat3.car.repositories.MemberRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DeveloperData implements ApplicationRunner {
    private final CarRepository carRepository;
    private final MemberRepository memberRepository;

    public DeveloperData(CarRepository carRepository, MemberRepository memberRepository) {
        this.carRepository = carRepository;
        this.memberRepository = memberRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Hello from DeveloperData");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla"));
        cars.add(new Car("Honda", "Civic"));
        cars.add(new Car("Ford", "Focus"));
        cars.add(new Car("Chevrolet", "Cruze"));
        cars.add(new Car("Volkswagen", "Golf"));
        cars.add(new Car("Nissan", "Altima"));
        cars.add(new Car("Hyundai", "Elantra"));
        cars.add(new Car("Kia", "Soul"));
        cars.add(new Car("BMW", "3 Series"));
        cars.add(new Car("Mercedes-Benz", "E-Class"));
        cars.add(new Car("Toyota", "Camry"));
        cars.add(new Car("Honda", "Accord"));
        cars.add(new Car("Ford", "Mustang"));
        cars.add(new Car("Chevrolet", "Malibu"));
        cars.add(new Car("Volkswagen", "Jetta"));
        cars.add(new Car("Nissan", "Maxima"));
        cars.add(new Car("Hyundai", "Sonata"));
        cars.add(new Car("Kia", "Optima"));
        cars.add(new Car("BMW", "5 Series"));
        cars.add(new Car("Mercedes-Benz", "C-Class"));
        cars.add(new Car("Toyota", "RAV4"));
        cars.add(new Car("Honda", "CR-V"));
        cars.add(new Car("Ford", "Escape"));
        cars.add(new Car("Chevrolet", "Equinox"));
        cars.add(new Car("Volkswagen", "Tiguan"));
        cars.add(new Car("Nissan", "Rogue"));
        cars.add(new Car("Hyundai", "Tucson"));
        cars.add(new Car("Kia", "Sportage"));
        cars.add(new Car("BMW", "X3"));
        cars.add(new Car("Mercedes-Benz", "GLC"));
        cars.add(new Car("Toyota", "Highlander"));
        cars.add(new Car("Honda", "Pilot"));
        cars.add(new Car("Ford", "Explorer"));
        cars.add(new Car("Chevrolet", "Traverse"));
        cars.add(new Car("Volkswagen", "Atlas"));
        cars.add(new Car("Nissan", "Murano"));
        cars.add(new Car("Hyundai", "Santa Fe"));
        cars.add(new Car("Kia", "Sorento"));
        cars.add(new Car("BMW", "X5"));
        cars.add(new Car("Mercedes-Benz", "GLE"));
        cars.add(new Car("Toyota", "4Runner"));
        cars.add(new Car("Honda", "HR-V"));
        cars.add(new Car("Ford", "Edge"));
        cars.add(new Car("Chevrolet", "Blazer"));
        cars.add(new Car("Volkswagen", "Touareg"));
        cars.add(new Car("Nissan", "Pathfinder"));
        cars.add(new Car("Hyundai", "Kona"));
        cars.add(new Car("Kia", "Niro"));
        cars.add(new Car("BMW", "X1"));
        cars.add(new Car("Mercedes-Benz", "GLA"));
        carRepository.saveAll(cars);
    }
}