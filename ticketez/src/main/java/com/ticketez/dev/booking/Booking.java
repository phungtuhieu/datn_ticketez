package com.ticketez.dev.booking;

import java.util.Date;
import java.util.List;

import com.ticketez.dev.account.Account;
import com.ticketez.dev.discount.Discount;
import com.ticketez.dev.paymentInfo.PaymentInfo;
import com.ticketez.dev.seatBooking.SeatBooking;
import com.ticketez.dev.serviceBooking.ServiceBooking;
import com.ticketez.dev.showtime.Showtime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Booking")
@Data
public class Booking {
	@Id
	private String id;

	@ManyToOne
	@JoinColumn(name = "account_id")
	private Account account;

	private Date createDate;

	@ManyToOne
	@JoinColumn(name = "showtime_id")
	private Showtime showtime;

	@OneToMany(mappedBy = "booking")
	private List<SeatBooking> seatsBookings;

	@ManyToOne
	@JoinColumn(name = "discount_id")
	private Discount discount;

	@OneToMany(mappedBy = "booking")
	private List<ServiceBooking> servicesBookings;

	@OneToOne(mappedBy = "booking")
	private PaymentInfo paymentInfo;
}