package iit.cinema.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by Attila on 2015.09.27..
 */
@Entity
public class Screening {

    @Id
    @GeneratedValue
    private Long screeningId;

    @ManyToOne
    private Movie movie;

    @ManyToOne
    private Auditorium auditorium;

    private LocalDateTime screeningStart;

    public Long getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(Long screeningId) {
        this.screeningId = screeningId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public LocalDateTime getScreeningStart() {
        return screeningStart;
    }

    public void setScreeningStart(LocalDateTime screeningStart) {
        this.screeningStart = screeningStart;
    }
}
