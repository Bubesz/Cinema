package iit.cinema.domain;

import java.util.List;

/**
 * Created by Attila on 2015.11.05.
 */
public interface Role {
    Long getRoleId();
    String getRoleName();
    List<User> getUsers();
}
