package pl.mizuirokoala.entity;

import org.hibernate.validator.constraints.NotEmpty;
import pl.mizuirokoala.role.User;

import javax.persistence.*;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    private String name;

    private int age;

    private String category;

    private String breed;

    private String diet;

    private String description;

    private String requirements;

    private String tempUserEmail;

    private boolean vaccinated;

    @ManyToOne
    private User user;

    public Pet() {

    }

}
