package iit.cinema.rest;

import iit.cinema.entity.Role;
import iit.cinema.entity.User;
import iit.cinema.facade.IUserLogic;
import iit.cinema.facade.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// http://localhost:8080/Cinema-UserLogic-1.1/userLogic/users/

/**
 * Created by Attila on 2015.10.21..
 */
@RestController
@RequestMapping("/userLogic")
public class UserLogicRestController implements IUserLogic {
    @Autowired
    private UserLogic userLogic;

    @RequestMapping("/users")
    public List<User> getUsers() {
        return userLogic.getUsers();
    }

    public List<Role> getRoles() {
        return userLogic.getRoles();
    }

    public String addUser(String userName, String password) {
        return userLogic.addUser(userName,password);
    }

    public String addRole(String roleName) {
        return userLogic.addRole(roleName);
    }

    public void addUserToRole(String userId, String roleId) {
        userLogic.addUserToRole(userId, roleId);
    }

    public void deleteUser(String userId) {
        userLogic.deleteUser(userId);
    }
}
