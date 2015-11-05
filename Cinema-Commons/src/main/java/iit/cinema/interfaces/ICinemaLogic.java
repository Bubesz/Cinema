package iit.cinema.interfaces;

import iit.cinema.entity.Auditorium;
import iit.cinema.entity.Movie;
import iit.cinema.entity.Reservation;
import iit.cinema.entity.Screening;

import java.util.List;

/**
 * Created by Attila on 2015.09.27..
 */
public interface ICinemaLogic {
    public List<Movie> getMovies();
    public List<Auditorium> getAuditoriums();
    public List<Screening> getScreeningsForMovie(String movieId);
    public List<Screening> getScreeningsForAuditoriums(String auditoriumId);
    public String addMovie(Movie movie);
    public String addScreening(Screening screening);
    public List<Reservation> getReservations(String screeningId);
    public void deleteReservation(String reservationId);
}
