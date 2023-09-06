package dat3.car.repositories;

import dat3.car.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, UUID> {

    //saveAll method to save a list of reservations
    static List<Reservation> saveAll(List<Reservation> reservations) {
        return null;
    }
}