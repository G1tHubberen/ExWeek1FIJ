package dat3.car.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.*;

@Entity
@Table(name = "cars") // Specify the table name
public class Car {
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
    @CreationTimestamp
    @Column(name = "created", nullable = false, updatable = false)
    private LocalDateTime created;
    @UpdateTimestamp
    @Column(name = "last_edited")
    private LocalDateTime lastEdited;

    public Car(String brand, String model) {
        this.id = generateId();
        this.created = LocalDateTime.now();
        this.brand = brand;
        this.model = model;
    }

    private UUID generateId() {
        return UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPricePrDay() {
        return pricePrDay;
    }

    public void setPricePrDay(double pricePrDay) {
        this.pricePrDay = pricePrDay;
    }

    public int getBestDiscount() {
        return bestDiscount;
    }

    public void setBestDiscount(int bestDiscount) {
        this.bestDiscount = bestDiscount;
    }

    @PreUpdate
    public void preUpdate() {
        this.lastEdited = LocalDateTime.now();
    }
}
