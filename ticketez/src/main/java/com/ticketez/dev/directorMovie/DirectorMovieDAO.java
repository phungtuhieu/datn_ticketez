package com.ticketez.dev.directorMovie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorMovieDAO extends JpaRepository<DirectorMovie, DirectorMoviePK> {
    
}
