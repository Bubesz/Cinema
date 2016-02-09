package iit.cinema.domain.restwrapper;

import iit.cinema.domain.Auditorium;
import iit.cinema.domain.Seat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Attila on 2015.11.05.
 */
public class AuditoriumWrapperForRest implements Auditorium {

    private iit.cinema.entity.Auditorium entity;

    public Long getAuditoriumId() {
        return this.entity.getAuditoriumId();
    }

    public void setAuditoriumId(Long auditoriumId) {
        this.entity.setAuditoriumId(auditoriumId);
    }

    public String getName() {
        return this.entity.getName();
    }

    public void setName(String name) {
        this.entity.setName(name);
    }

    public List<Seat> getSeats() {
        // TODO create a mapper / factory for that?
        List<Seat> seats = new ArrayList<>();
        for (iit.cinema.entity.Seat entity : this.entity.getSeats()) {
//            SeatWrapperForMemory seat = new SeatWrapperForMemory();
//            seat.setEntity(entity);
//            seats.add(seat);
        }
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        // same as upper
//        this.entity.setSeats(seats);
    }
}
