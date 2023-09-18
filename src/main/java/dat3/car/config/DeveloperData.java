package dat3.car.config;

import dat3.car.entity.Car;
import dat3.car.entity.Reservation;
import dat3.car.entity.Member;
import dat3.car.repositories.CarRepository;
import dat3.car.repositories.MemberRepository;
import dat3.car.repositories.ReservationRepository;
import dat3.security.entity.Role;
import dat3.security.entity.UserWithRoles;
import dat3.security.repository.UserWithRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class DeveloperData implements ApplicationRunner {
    private final CarRepository carRepository;
    private final MemberRepository memberRepository;
    private final ReservationRepository reservationRepository;

    public DeveloperData(CarRepository carRepository, MemberRepository memberRepository, ReservationRepository reservationRepository) {
        this.carRepository = carRepository;
        this.memberRepository = memberRepository;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Hello from DeveloperData");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 50.0, 10));
        cars.add(new Car("Honda", "Civic", 45.0, 8));
        cars.add(new Car("Ford", "Focus", 48.0, 12));
        cars.add(new Car("Chevrolet", "Cruze", 47.5, 9));
        cars.add(new Car("Volkswagen", "Golf", 49.0, 11));
        cars.add(new Car("Nissan", "Altima", 46.5, 7));
        cars.add(new Car("Hyundai", "Elantra", 44.5, 10));
        cars.add(new Car("Kia", "Soul", 51.0, 13));
        cars.add(new Car("BMW", "3 Series", 55.0, 15));
        cars.add(new Car("Mercedes-Benz", "E-Class", 60.0, 18));
        cars.add(new Car("Toyota", "Camry", 52.0, 14));
        cars.add(new Car("Honda", "Accord", 49.5, 11));
        cars.add(new Car("Ford", "Mustang", 65.0, 20));
        cars.add(new Car("Chevrolet", "Malibu", 48.5, 9));
        cars.add(new Car("Volkswagen", "Jetta", 47.0, 12));
        cars.add(new Car("Nissan", "Maxima", 54.0, 17));
        cars.add(new Car("Hyundai", "Sonata", 46.0, 8));
        cars.add(new Car("Kia", "Optima", 50.5, 13));
        cars.add(new Car("BMW", "5 Series", 58.0, 16));
        cars.add(new Car("Mercedes-Benz", "C-Class", 57.5, 15));
        cars.add(new Car("Toyota", "RAV4", 53.0, 12));
        cars.add(new Car("Honda", "CR-V", 49.0, 10));
        cars.add(new Car("Ford", "Escape", 51.5, 14));
        cars.add(new Car("Chevrolet", "Equinox", 52.0, 13));
        cars.add(new Car("Volkswagen", "Tiguan", 55.0, 16));
        cars.add(new Car("Nissan", "Rogue", 48.5, 11));
        cars.add(new Car("Hyundai", "Tucson", 47.5, 10));
        cars.add(new Car("Kia", "Sportage", 50.0, 12));
        cars.add(new Car("BMW", "X3", 59.0, 17));
        cars.add(new Car("Mercedes-Benz", "GLC", 61.0, 19));
        cars.add(new Car("Toyota", "Highlander", 56.0, 15));
        cars.add(new Car("Honda", "Pilot", 54.5, 13));
        cars.add(new Car("Ford", "Explorer", 58.5, 16));
        cars.add(new Car("Chevrolet", "Traverse", 59.0, 15));
        cars.add(new Car("Volkswagen", "Atlas", 61.5, 18));
        cars.add(new Car("Nissan", "Murano", 52.5, 12));
        cars.add(new Car("Hyundai", "Santa Fe", 49.5, 10));
        cars.add(new Car("Kia", "Sorento", 53.0, 14));
        cars.add(new Car("BMW", "X5", 64.0, 19));
        cars.add(new Car("Mercedes-Benz", "GLE", 65.5, 20));
        cars.add(new Car("Toyota", "4Runner", 57.0, 15));
        cars.add(new Car("Honda", "HR-V", 48.0, 9));
        cars.add(new Car("Ford", "Edge", 50.0, 11));
        cars.add(new Car("Chevrolet", "Blazer", 53.5, 13));
        cars.add(new Car("Volkswagen", "Touareg", 60.0, 18));
        cars.add(new Car("Nissan", "Pathfinder", 55.5, 16));
        cars.add(new Car("Hyundai", "Kona", 46.0, 8));
        cars.add(new Car("Kia", "Niro", 48.5, 10));
        cars.add(new Car("BMW", "X1", 54.0, 12));
        cars.add(new Car("Mercedes-Benz", "GLA", 52.5, 11));

        carRepository.saveAll(cars);

        // Create and save members
        Member member1 = new Member("m1", "1234", "d@c", "Anna", "Madsen", "vej", "by", "0001", true, 1);
        Member member2 = new Member("m2", "1234", "d@c", "Benny", "Jensen", "vej", "by", "0002", true, 2);

        memberRepository.saveAll(List.of(member1, member2));

        // Create and save cars
        Car car1 = new Car("BMW", "X2", 54.1, 13);
        Car car2 = new Car("kia", "Niro", 48.4, 9);

        carRepository.saveAll(List.of(car1, car2));


        LocalDate date1 = LocalDate.of(2023, 10, 1);
        LocalDate date2 = LocalDate.of(2023, 10, 2);
        // Create and save reservations
        /*Reservation reservation1 = new Reservation("m1", "c1", LocalDateTime.now(), LocalDateTime.now().plusDays(3));
        Reservation reservation2 = new Reservation("m2", "c2", LocalDateTime.now(), LocalDateTime.now().plusDays(2));

        ReservationRepository.saveAll(List.of(reservation1, reservation2));

        System.out.println("Found: " + reservationRepository.existsByCarIdAndRentalDate(car1.getId(), date1));*/


        setupUserWithRoleUsers();
    }

    @Autowired
    UserWithRolesRepository userWithRolesRepository;

    /*****************************************************************************************
     NEVER  COMMIT/PUSH CODE WITH DEFAULT CREDENTIALS FOR REAL
     iT'S ONE OF THE TOP SECURITY FLAWS YOU CAN DO
     *****************************************************************************************/
    private void setupUserWithRoleUsers() {

        System.out.println("******************************************************************************");
        System.out.println("******* NEVER  COMMIT/PUSH CODE WITH DEFAULT CREDENTIALS FOR REAL ************");
        System.out.println("******* REMOVE THIS BEFORE DEPLOYMENT, AND SETUP DEFAULT USERS DIRECTLY  *****");
        System.out.println("**** ** ON YOUR REMOTE DATABASE                 ******************************");
        System.out.println("******************************************************************************");
        /*UserWithRoles user01 = new UserWithRoles("user01", passwordUsedByAll, "user1@a.dk");
        UserWithRoles user02 = new UserWithRoles("user02", passwordUsedByAll, "user2@a.dk");
        UserWithRoles user03 = new UserWithRoles("user03", passwordUsedByAll, "user3@a.dk");
        UserWithRoles user04 = new UserWithRoles("user04", passwordUsedByAll, "user4@a.dk");
        user01.addRole(Role.USER);
        user01.addRole(Role.ADMIN);
        user02.addRole(Role.USER);
        user03.addRole(Role.ADMIN);
        //No Role assigned to user4
        userWithRolesRepository.save(user01);
        userWithRolesRepository.save(user02);
        userWithRolesRepository.save(user03);
        userWithRolesRepository.save(user04);*/
    }
}