package com.ticketez.dev.service;

import java.util.List;

import com.ticketez.dev.cinemaComplex.CinemaComplex;
import com.ticketez.dev.priceService.PriceService;
import com.ticketez.dev.serviceBooking.ServiceBooking;

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
@Table(name = "Services")
@Data
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String description;
	private String image;

	@ManyToOne
	@JoinColumn(name = "cinema_complex_id")
	private CinemaComplex cinemaComplex;

	@OneToMany(mappedBy = "service")
	private List<PriceService> priceServices;

	@OneToMany(mappedBy = "service")
	private List<ServiceBooking> servicesBookings;

}