package com.ticketez.dev.actorMovie;

import com.ticketez.dev.actor.Actor;
import com.ticketez.dev.movie.Movie;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Actors_Movies")
@Data
public class ActorMovie {

	@EmbeddedId
	ActorMoviePK actorMoviePK;

	@ManyToOne
	// @JoinColumn(name = "actor_id")
	@JoinColumn(name = "actor_id", insertable = false, updatable = false)
	private Actor actor;

	@ManyToOne
	// @JoinColumn(name = "movie_id")
	@JoinColumn(name = "movie_id", insertable = false, updatable = false)
	private Movie movie;
}