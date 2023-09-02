package com.ticketez.dev.genreMovie;

import com.ticketez.dev.genre.Genre;
import com.ticketez.dev.movie.Movie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Genres_Movies")
@Data
public class GenreMovie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "genre_id")
	private Genre genre;

	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
}