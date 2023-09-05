package com.ticketez.dev.discountBooking;

import com.ticketez.dev.booking.Booking;
import com.ticketez.dev.discount.Discount;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Discounts_Booking")
@Data
public class DiscountsBooking {

	@EmbeddedId
	DiscountsBookingPK discountsBookingPK;

	@ManyToOne
	@JoinColumn(name = "discount_id", insertable = false, updatable = false)
	private Discount discount;

	@ManyToOne
	@JoinColumn(name = "booking_id", insertable = false, updatable = false)
	private Booking booking;

}