package iit.cinema.repository;

import iit.cinema.entity.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Attila on 2015.09.28..
 */
@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium,Long> {
}
