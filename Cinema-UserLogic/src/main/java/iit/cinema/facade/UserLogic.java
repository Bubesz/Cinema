package iit.cinema.facade;

import iit.cinema.entity.Role;
import iit.cinema.entity.User;
import iit.cinema.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Attila on 2015.09.27..
 */
@Service
public class UserLogic implements IUserLogic {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public List<Role> getRoles() {
        return null;
    }

    public String addUser(String userName, String password) {
        // TODO not the first step of generation
        User user = new User();
        user.setUseName(userName);
        user.setPassword(password);
        return userRepository.save(user).getUserId().toString();
    }

    public String addRole(String roleName) {
        return null;
    }

    public void addUserToRole(String userId, String roleId) {

    }

    public void deleteUser(String userId) {
        userRepository.delete(Long.valueOf(userId));
    }
}
