package com.ticketez.dev.province;

import java.util.List;

import com.ticketez.dev.cinemaComplex.CinemaComplex;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Provinces")
@Data
public class Province {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@OneToMany(mappedBy = "province")
	private List<CinemaComplex> cinemaComplexes;

	// Các mối quan hệ khác...
}