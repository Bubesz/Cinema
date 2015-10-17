package iit.cinema.facade;

import iit.cinema.entity.Role;
import iit.cinema.entity.User;

import java.util.List;

/**
 * Created by Attila on 2015.09.27..
 */
public interface IUserLogic {
    public List<User> getUsers();
    public List<Role> getRoles();
    public String addUser(String userName, String password);
    public String addRole(String roleName);
    public void addUserToRole(String userId, String roleId);
    public void deleteUser(String userId);
}
