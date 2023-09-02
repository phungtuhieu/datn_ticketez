package com.ticketez.dev.cinemaComplex;

import java.sql.Time;
import java.util.List;

import com.ticketez.dev.cinema.Cinema;
import com.ticketez.dev.discount.Discount;
import com.ticketez.dev.event.Event;
import com.ticketez.dev.province.Province;
import com.ticketez.dev.service.Service;

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
@Table(name = "Cinema_Complex")
@Data
public class CinemaComplex {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String address;
	private String phone;
	private Time openingTime;
	private Time closingTime;

	@ManyToOne
	@JoinColumn(name = "province_id")
	private Province province;

	@OneToMany(mappedBy = "cinemaComplex")
	private List<Event> events;

	@OneToMany(mappedBy = "cinemaComplex")
	private List<Service> services;

	@OneToMany(mappedBy = "cinemaComplex")
	private List<Discount> discounts;

	@OneToMany(mappedBy = "cinemaComplex")
	private List<Cinema> cinemas;
}