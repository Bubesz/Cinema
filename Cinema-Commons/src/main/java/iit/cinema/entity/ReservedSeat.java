package iit.cinema.entity;

import iit.cinema.status.SeatStatus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Attila on 2015.09.27..
 */
@Entity
public class ReservedSeat {

    @Id
    @GeneratedValue
    private Long reservedSeatId;

    @ManyToOne // FIXME TBD isn't reservation better than screening?
    private Reservation reservation;

    @ManyToOne
    private Seat seat;

    private SeatStatus status;

    public Long getReservedSeatId() {
        return reservedSeatId;
    }

    public void setReservedSeatId(Long reservedSeatId) {
        this.reservedSeatId = reservedSeatId;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public SeatStatus getStatus() {
        return status;
    }

    public void setStatus(SeatStatus status) {
        this.status = status;
    }
}
