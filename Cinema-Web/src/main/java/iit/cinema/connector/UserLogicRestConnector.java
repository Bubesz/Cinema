package iit.cinema.connector;

import iit.cinema.entity.Role;
import iit.cinema.entity.User;
import iit.cinema.interfaces.IUserLogic;
import iit.cinema.rest.UserLogicRestController;
import org.springframework.hateoas.Link;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by Attila on 2015. 10. 24..
 */
public class UserLogicRestConnector implements IUserLogic {

    private RestTemplate restTemplate = new RestTemplate();

    public List<User> getUsers() {
        System.out.println("rest-getUsers");
        Link link = linkTo(methodOn(UserLogicRestController.class).getUsers()).withSelfRel(); //FIXME coupling!
        List<User> list = restTemplate.getForObject(link.getHref(), List.class);
        return list;
    }

    public List<Role> getRoles() {
        return null;
    }

    public String addUser(String userName, String password) {
        return null;
    }

    public String addRole(String roleName) {
        return null;
    }

    public void addUserToRole(String userId, String roleId) {

    }

    public void deleteUser(String userId) {

    }
}
