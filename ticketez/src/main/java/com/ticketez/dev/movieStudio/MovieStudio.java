package com.ticketez.dev.movieStudio;

import java.util.List;

import com.ticketez.dev.movie.Movie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Movie_Studio")
@Data
public class MovieStudio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String country;
	private String email;
	private String description;

	@OneToMany(mappedBy = "movieStudio")
	private List<Movie> movies;

}