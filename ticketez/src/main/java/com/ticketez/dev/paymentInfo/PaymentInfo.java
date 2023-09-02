package com.ticketez.dev.paymentInfo;

import java.util.Date;

import com.ticketez.dev.booking.Booking;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Payment_Info")
@Data
public class PaymentInfo {
	@Id
	private String transactionId;

	private String tmnCode;

	@ManyToOne
	@JoinColumn(name = "booking_id")
	private Booking booking;

	private float amount;
	private Date payDate;
	private String orderInfo;
	private String bankCode;
	private String transactionStatus;

}