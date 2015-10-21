package iit.cinema.facade;

import iit.cinema.entity.Auditorium;
import iit.cinema.entity.Movie;
import iit.cinema.entity.Reservation;
import iit.cinema.entity.Screening;
import iit.cinema.repository.AuditoriumRepository;
import iit.cinema.repository.MovieRepository;
import iit.cinema.repository.ReservationRepository;
import iit.cinema.repository.ScreeningRepository;
import iit.cinema.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Attila on 2015.09.28..
 */
@Service
public class CinemaLogic implements ICinemaLogic {
    @Autowired
    private AuditoriumRepository auditoriumRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ScreeningRepository screeningRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Movie> getMovies() {
        return ListUtil.createListFromIterable(movieRepository.findAll());
    }

    public List<Auditorium> getAuditoriums() {
        return ListUtil.createListFromIterable(auditoriumRepository.findAll());
    }

    public List<Screening> getScreeningsForMovie(String movieId) {
        return null;
    }

    public List<Screening> getScreeningsForAuditoriums(String auditoriumId) {
        return null;
    }

    public String addMovie(Movie movie) {
        return movieRepository.save(movie).getMovieId().toString();
    }

    public String addScreening(Screening screening) {
        return screeningRepository.save(screening).getScreeningId().toString();
    }

    public List<Reservation> getReservations(String screeningId) {
        return null;
    }

    public void deleteReservation(String reservationId) {

    }
}
