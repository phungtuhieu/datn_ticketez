package com.ticketez.dev.account;

import java.util.Date;
import java.util.List;

import com.ticketez.dev.booking.Booking;
import com.ticketez.dev.review.Review;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Accounts")
@Data
public class Account {
	@Id
	private String phone;
	private String fullname;
	private String email;
	private String password;
	private Date birthday;
	private boolean gender;
	private boolean role;
	private boolean active;
	private boolean verified;
	private int points;

	@OneToMany(mappedBy = "account")
	private List<Review> reviews;

	@OneToMany(mappedBy = "account")
	private List<Booking> bookings;
//
//	@OneToMany(mappedBy = "account")
//	private List<ServiceBooking> servicesBookings;

}
