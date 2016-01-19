package iit.cinema.entity;

import iit.cinema.status.ReservationStatus;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Attila on 2015.09.27..
 */
@Entity
public class Reservation {

    @Id
    @GeneratedValue
    private Long reservationId;

    @ManyToOne
    private Screening screening;

    @OneToMany(mappedBy = "reservation") // FIXME reservedSeat reference?
    private List<ReservedSeat> seats;

    private ReservationStatus status;

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Screening getScreening() {
        return screening;
    }

    public void setScreening(Screening screening) {
        this.screening = screening;
    }

    public List<ReservedSeat> getSeats() {
        return seats;
    }

    public void setSeats(List<ReservedSeat> seats) {
        this.seats = seats;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}
