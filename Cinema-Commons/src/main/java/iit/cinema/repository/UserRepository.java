package iit.cinema.repository;

import iit.cinema.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Attila on 2015.09.28..
 */
@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
