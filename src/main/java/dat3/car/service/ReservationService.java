package dat3.car.service;

import dat3.car.dto.ReservationRequest;
import dat3.car.dto.ReservatonResponse;
import dat3.car.entity.Car;
import dat3.car.entity.Member;
import dat3.car.entity.Reservation;
import dat3.car.repositories.CarRepository;
import dat3.car.repositories.MemberRepository;
import dat3.car.repositories.ReservationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ReservationService {
    CarRepository carRepository;
    MemberRepository memberRepository;
    ReservationRepository reservationRepository;

    public ReservationService(CarRepository carRepository, MemberRepository memberRepository, ReservationRepository reservationRepository) {
        this.carRepository = carRepository;
        this.memberRepository = memberRepository;
        this.reservationRepository = reservationRepository;
    }

    public ReservatonResponse reserveCar(ReservationRequest body) {
        if(body.getStartDate().isBefore(LokalDato.now()) || body.getEndDate().isBefore(LokalDato.now())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Start and end date must be in the future");
        }
        Member member = memberRepository.findByUsername(body.getUsername()).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Member not found"));
        Car car = CarRepository.findById(body.getCarId()).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Car not found"));
        Reservation reservation = reservationRepository.findById(body.getReservationId()).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Reservation not found"));
        Reservation res = new Reservation(body.getStartDate(), car, member);

        return null;
    }
}