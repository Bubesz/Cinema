package iit.cinema.interfaces;

import iit.cinema.entity.Movie;
import iit.cinema.entity.ReservedSeat;
import iit.cinema.entity.Screening;
import iit.cinema.entity.Seat;
import iit.cinema.exception.CinemaException;

import java.util.List;

/**
 * Created by Attila on 2015.09.27..
 */
public interface IReservationLogic {
    public List<Movie> getMovies();
    public List<Screening> getScreenings(String movieId) throws CinemaException;
    public List<Seat> getSeats(String screeningId) throws CinemaException;
    public List<ReservedSeat> getReservedSeats(String screeningId) throws CinemaException;
    public String lock(String screeningId, Seat seat, int count) throws CinemaException;
    public void unlock(String lockId) throws CinemaException;
    public void reserve(String lockId) throws CinemaException;
    public void buy(String lockId, String creditCardNumber) throws CinemaException;
}
