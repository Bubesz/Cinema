package iit.cinema.domain;

import iit.cinema.status.SeatStatus;

/**
 * Created by Attila on 2015.11.05.
 */
public interface ReservedSeat {
    Long getReservedSeatId();
    Reservation getReservation();
    Seat getSeat();
    SeatStatus getStatus();
}
