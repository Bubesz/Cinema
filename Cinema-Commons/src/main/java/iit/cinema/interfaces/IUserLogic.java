package iit.cinema.interfaces;

import iit.cinema.entity.Role;
import iit.cinema.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Attila on 2015.09.27..
 */
@RequestMapping("/userLogic")
public interface IUserLogic { //TODO annotation here
    @RequestMapping("/users")
    public List<User> getUsers();
    @RequestMapping("/roles")
    public List<Role> getRoles();
    public String addUser(String userName, String password);
    public String addRole(String roleName);
    public void addUserToRole(String userId, String roleId);
    public void deleteUser(String userId);
}
