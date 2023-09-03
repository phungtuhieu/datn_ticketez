package com.ticketez.dev.booking;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ticketez.dev.account.Account;
import com.ticketez.dev.discountBooking.DiscountsBooking;
import com.ticketez.dev.paymentInfo.PaymentInfo;
import com.ticketez.dev.seatBooking.SeatBooking;
import com.ticketez.dev.serviceBooking.ServiceBooking;
import com.ticketez.dev.showtime.Showtime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	@JsonIgnore
	private List<SeatBooking> seatsBookings;

	@OneToMany(mappedBy = "booking")
	@JsonIgnore
	private List<DiscountsBooking> discountsBookings;

	@OneToMany(mappedBy = "booking")
	private List<ServiceBooking> servicesBookings;

	@OneToMany(mappedBy = "booking")
	private List<PaymentInfo> paymentInfos;
}