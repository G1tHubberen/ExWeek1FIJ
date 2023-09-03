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
    @Column
    public String username;
    @Column
    public String password;
    @Column
    public String email;
    @Column
    public String firstName;
    @Column
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
}
