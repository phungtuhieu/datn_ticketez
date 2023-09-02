package com.ticketez.dev.formatMovie;

import com.ticketez.dev.format.Format;
import com.ticketez.dev.movie.Movie;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Formats_Movies")
@Data
public class FormatMovie {
	@EmbeddedId
	FormatMoviePK formatMoviePK;

	@ManyToOne
	@JoinColumn(name = "format_id", insertable = false, updatable = false)
	private Format format;

	@ManyToOne
	@JoinColumn(name = "movie_id", insertable = false, updatable = false)
	private Movie movie;

}