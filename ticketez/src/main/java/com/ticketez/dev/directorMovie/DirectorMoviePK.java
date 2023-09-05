package com.ticketez.dev.directorMovie;
import java.io.Serializable;

import com.ticketez.dev.director.Director;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Setter
@Getter
public class DirectorMoviePK implements Serializable {
    
	@Column(name = "director_id", insertable = false, updatable = false)
	private Long directorId;

	@Column(name = "movie_id", insertable = false, updatable = false)
	private Long movieId;
}
