package dat3.car.controller;

import dat3.car.entity.Reservation;
import dat3.car.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Reservation getReservationById(@PathVariable UUID id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        // You may want to add validation here to check if the reservation is valid.
        // For example, check if the requested time slot is available.
        return reservationRepository.save(reservation);
    }

    @PutMapping("/{id}")
    public Reservation updateReservation(@PathVariable UUID id, @RequestBody Reservation updatedReservation) {
        Optional<Reservation> existingReservation = reservationRepository.findById(id);

        if (existingReservation.isPresent()) {
            Reservation reservation = existingReservation.get();
            // Update reservation properties as needed
            reservation.setStartDate(updatedReservation.getStartDate());
            reservation.setEndDate(updatedReservation.getEndDate());
            // Update other properties as necessary

            return reservationRepository.save(reservation);
        } else {
            return null; // Reservation with given ID not found
        }
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable UUID id) {
        reservationRepository.deleteById(id);
    }
}
