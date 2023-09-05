package com.ticketez.dev.discount;

import java.util.Date;
import java.util.List;

import com.ticketez.dev.cinemaComplex.CinemaComplex;
import com.ticketez.dev.discountBooking.DiscountsBooking;

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
@Table(name = "Discounts")
@Data
public class Discount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private String couponCode;
	private float amount;
	private Date startDate;
	private Date endDate;
	private boolean status;
	private boolean discountType;

	@ManyToOne
	@JoinColumn(name = "cinema_complex_id")
	private CinemaComplex cinemaComplex;

	@OneToMany(mappedBy = "discount")
	private List<DiscountsBooking> discountsBookings;

}