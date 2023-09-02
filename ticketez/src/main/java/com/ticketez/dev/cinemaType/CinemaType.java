package com.ticketez.dev.cinemaType;

import java.util.List;

import com.ticketez.dev.cinema.Cinema;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Cinema_Types")
@Data
public class CinemaType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String typeName;
	private String description;

	@OneToMany(mappedBy = "cinemaType")
	private List<Cinema> cinemas;

}