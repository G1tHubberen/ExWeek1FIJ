package dat3.car.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import jakarta.persistence.*;

@Entity
//@Table(name = "cars") // Specify the table name
@Data // Lombok´s annotation to generate getters & setters, toString, equals, hashCode, and a constructor
@NoArgsConstructor // Lombok´s annotation to generate a no-args constructor
//@AllArgsConstructor // Lombok´s annotation to generate an all-args constructor
public class Car extends AdminDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "car_brand", length = 50, nullable = false) // Specify column name, length, and non-null constraint
    private String brand;
    @Column(name = "car_model", length = 60, nullable = false)
    private String model;
    @Column(name = "rental_price_day")
    private double pricePrDay;
    @Column(name = "max_discount")
    private int bestDiscount;

    public Car(String brand, String model,double pricePrDay, int bestDiscount) {
        this.brand = brand;
        this.model = model;
        this.pricePrDay = pricePrDay;
        this.bestDiscount = bestDiscount;
    }

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private List<Reservation> carReservations = new ArrayList<>();

}
