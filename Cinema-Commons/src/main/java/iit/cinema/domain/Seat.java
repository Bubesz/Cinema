package iit.cinema.domain;

/**
 * Created by Attila on 2015.11.05.
 */
public interface Seat {
    Long getSeatId();
    Auditorium getAuditorium();
    String getRow();
    String getColumn();

}
