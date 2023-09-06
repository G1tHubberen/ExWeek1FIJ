package dat3.car.dto;

import dat3.car.entity.Reservation;

import java.time.LocalDate;

public class ReservatonResponse {

    int id;
    int carId;
    String brand;
    String model;
    LocalDate reservationDate;

    public ReservatonResponse(Reservation reservation) {
        this.id = reservation.getId();
        this.carId = reservation.getCar().getId();
        this.brand = reservation.getCar().getBrand();
        this.model = reservation.getCar().getModel();
        this.reservationDate = reservation.getReservationDate();
        this.reservationDate = reservation.getReservationDate();
    }

}
