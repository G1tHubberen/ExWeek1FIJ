package dat3.car.dto;

import dat3.car.entity.Reservation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class ReservatonResponse {

    UUID id;
    UUID carId;
    String brand;
    String model;
    double price;
    LocalDate reservationDate;

    public ReservatonResponse(Reservation reservation) {
        this.id = reservation.getId();
        this.price = reservation.getCar().getPricePrDay();
        this.carId = reservation.getCar().getId();
        this.brand = reservation.getCar().getBrand();
        this.model = reservation.getCar().getModel();
        this.reservationStartDate = reservation.getReservationStartDate();
        this.reservationEndDate = reservation.getReservationEndDate();
    }

}
