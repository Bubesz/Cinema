package iit.cinema.domain;

import java.util.List;

/**
 * Created by Attila on 2015.11.05.
 */
public interface Auditorium {
    Long getAuditoriumId();
    String getName();
    List<Seat> getSeats();
}
