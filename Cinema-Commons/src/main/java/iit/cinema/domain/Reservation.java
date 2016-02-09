package iit.cinema.domain;

import iit.cinema.status.ReservationStatus;

import java.util.List;

/**
 * Created by Attila on 2015.11.05.
 */
public interface Reservation {
    Long getReservationId();
    Screening getScreening();
    List<ReservedSeat> getSeats();
    ReservationStatus getStatus();
}
