package com.ticketez.dev.cinema;

import java.util.List;

import com.ticketez.dev.cinemaComplex.CinemaComplex;
import com.ticketez.dev.cinemaType.CinemaType;
import com.ticketez.dev.seat.Seat;
import com.ticketez.dev.showtime.Showtime;

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
@Table(name = "Cinemas")
@Data
public class Cinema {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private boolean status;

	@ManyToOne
	@JoinColumn(name = "cinema_type_id")
	private CinemaType cinemaType;

	@ManyToOne
	@JoinColumn(name = "cinema_complex_id")
	private CinemaComplex cinemaComplex;

	@OneToMany(mappedBy = "cinema")
	private List<Seat> seats;

	@OneToMany(mappedBy = "cinema")
	private List<Showtime> showtimes;
}