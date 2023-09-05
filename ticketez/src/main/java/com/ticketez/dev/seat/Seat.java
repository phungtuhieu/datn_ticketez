package com.ticketez.dev.seat;

import java.util.List;

import com.ticketez.dev.cinema.Cinema;
import com.ticketez.dev.seatBooking.SeatBooking;
import com.ticketez.dev.seatType.SeatType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Seats")
@Data
public class Seat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private boolean status;
	private String description;

	@ManyToOne
	@JoinColumn(name = "seat_type_id")
	private SeatType seatType;

	@ManyToOne
	@JoinColumn(name = "cinema_id")
	private Cinema cinema;

	@OneToMany(mappedBy = "seat")
	private List<SeatBooking> seatsBookings;
}