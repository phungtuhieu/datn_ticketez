package com.ticketez.dev.actorMovie;

import java.io.Serializable;

import com.ticketez.dev.director.Director;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Setter
@Getter
public class ActorMoviePK implements Serializable {

    @Column(name = "actor_id", insertable = false, updatable = false)
    private Long actorId;

    @Column(name = "movie_id", insertable = false, updatable = false)
    private Long movieId;
}