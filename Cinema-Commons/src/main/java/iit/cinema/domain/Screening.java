package iit.cinema.domain;

import java.time.LocalDateTime;

/**
 * Created by Attila on 2015.11.05.
 */
public interface Screening {
    Long getScreeningId();
    Movie getMovie();
    Auditorium getAuditorium();
    LocalDateTime getScreeningStart();
}
