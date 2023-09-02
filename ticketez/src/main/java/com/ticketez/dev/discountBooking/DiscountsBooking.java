package com.ticketez.dev.discountBooking;

import java.io.Serializable;

import com.ticketez.dev.booking.Booking;
import com.ticketez.dev.discount.Discount;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Discounts_Booking")
@Data
public class DiscountsBooking implements Serializable {
	@Id
	@ManyToOne
	@JoinColumn(name = "discount_id")
	private Discount discount;

	@Id
	@ManyToOne
	@JoinColumn(name = "booking_id")
	private Booking booking;

}