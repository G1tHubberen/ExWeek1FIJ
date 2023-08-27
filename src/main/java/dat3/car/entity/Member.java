package dat3.car.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Entity
public class Member {
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
    @CreationTimestamp
    @Column(name = "created", nullable = false, updatable = false)
    private LocalDateTime created;
    @UpdateTimestamp
    @Column(name = "last_edited")
    private LocalDateTime lastEdited;

    public Member(String user, String password, String email, String firstName,
                  String lastName, String street, String city, String zip) {
        this.username = user;
        this.password= password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.created = LocalDateTime.now();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isApproved() {
        return approved;
    }

    public int getRanking() {
        return ranking;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password= password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @PreUpdate
    public void preUpdate() {
        this.lastEdited = LocalDateTime.now();
    }
}
