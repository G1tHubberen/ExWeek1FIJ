package dat3.car.repositories;

        import dat3.car.entity.Car;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

        import java.util.UUID;

@Repository
public interface CarRepository extends JpaRepository<Car, UUID> {
    // You can add custom query methods here if needed
}
