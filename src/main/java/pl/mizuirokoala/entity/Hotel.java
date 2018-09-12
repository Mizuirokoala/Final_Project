package pl.mizuirokoala.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String name;

    private String password;

    @NotEmpty
    @Email
    @Column(unique = true)
    private String email;

    private int capacity;

    @Size(max = 160)
    private String description;


//	@OneToMany(mappedBy = "hotel")
//	private List<ReservationDate> reservationDate = new ArrayList<>();

    public Hotel() {

    }
}
