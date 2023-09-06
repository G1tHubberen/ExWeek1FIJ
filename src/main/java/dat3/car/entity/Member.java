package dat3.car.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member extends AdminDetails{
    @Id
    @Column(nullable = false)
    public String username;
    @Column(nullable = false)
    public String password;
    @Column(nullable = false)
    public String email;
    @Column(nullable = false)
    public String firstName;
    @Column(nullable = false)
    public String lastName;
    @Column
    public String street;
    @Column
    public String city;
    @Column
    public String zip;
    @Column
    public boolean approved;
    @Column
    public int ranking;

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL)
    private List<Reservation> reservations = new ArrayList<>();

    public Member(String username, String password, String email, String firstName, String lastName, String street, String city, String zip, boolean approved, int ranking) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.approved = approved;
        this.ranking = ranking;
    }
}
