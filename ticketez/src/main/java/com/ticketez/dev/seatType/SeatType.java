package com.ticketez.dev.seatType;

import java.util.List;

import com.ticketez.dev.price.Price;
import com.ticketez.dev.seat.Seat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Seat_Types")
@Data
public class SeatType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String image;
	private String description;

	@OneToMany(mappedBy = "seatType")
	private List<Seat> seats;

	@OneToMany(mappedBy = "seatType")
	private List<Price> prices;

}