package iit.cinema.domain;

import java.util.List;

/**
 * Created by Attila on 2015.11.05.
 */
public interface User {
    Long getUserId();
    String getUserName();
    String getPassword();
    List<Role> getRoles();
}
