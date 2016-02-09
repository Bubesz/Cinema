package iit.cinema.domain;

import java.time.Duration;

/**
 * Created by Attila on 2015.11.05.
 */
public interface Movie {
    Long getMovieId();
    String getTitle();
    String getDirector();
    String getCast();
    Duration getDuration();
}
