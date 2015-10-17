package iit.cinema.facade;

import iit.cinema.entity.Movie;
import iit.cinema.entity.ReservedSeat;
import iit.cinema.entity.Screening;
import iit.cinema.entity.Seat;
import iit.cinema.exception.CinemaException;
import iit.cinema.repository.MovieRepository;
import iit.cinema.repository.ScreeningRepository;
import iit.cinema.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Attila on 2015.09.27..
 */
@Service
public class ReservationLogic implements IReservationLogic {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ScreeningRepository screeningRepository;

    @Autowired
    private SeatRepository seatRepository;

    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    public List<Screening> getScreenings(String movieId) throws CinemaException {
        return screeningRepository.findAll();
    }

    public List<Seat> getSeats(String screeningId) throws CinemaException {
        return seatRepository.findAll();
    }

    public List<ReservedSeat> getReservedSeats(String screeningId) throws CinemaException {
        return null;
    }

    public String lock(String screeningId, Seat seat, int count) throws CinemaException {
        return null;
    }

    public void unlock(String lockId) throws CinemaException {

    }

    public void reserve(String lockId) throws CinemaException {

    }

    public void buy(String lockId, String creditCardNumber) throws CinemaException {

    }
}
