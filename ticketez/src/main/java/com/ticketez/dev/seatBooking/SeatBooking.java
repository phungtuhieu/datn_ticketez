package com.ticketez.dev.seatBooking;

import com.ticketez.dev.booking.Booking;
import com.ticketez.dev.seat.Seat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Seats_Booking")
@Data
public class SeatBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "seat_id")
	private Seat seat;

	@ManyToOne
	@JoinColumn(name = "booking_id")
	private Booking booking;

	private int status; // Đã đặt, đang chọn, đã chọn

}