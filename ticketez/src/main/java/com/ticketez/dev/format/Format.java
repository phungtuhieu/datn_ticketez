package com.ticketez.dev.format;

import java.util.List;

import com.ticketez.dev.formatMovie.FormatMovie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Formats")
@Data
public class Format {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String description;

	@OneToMany(mappedBy = "format")
	private List<FormatMovie> formatMovies;

}