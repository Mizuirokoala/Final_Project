package pl.mizuirokoala.entity;


import javax.persistence.*;

@Entity
@Table(name = "hotel_details")
public class HotelDetails {

    @Id
    private long id;

    private String city;

    private String streetNumber;

    private String street;


    private String details;

    private String requirements;

    @OneToOne
    @JoinColumn(name = "id")
    private Hotel hotel;


}
/*
	private Long id;
	private String firstName;
	private String lastName;

	private Person person;
 */