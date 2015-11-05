package iit.cinema.rest;

import iit.cinema.entity.Role;
import iit.cinema.entity.User;
import iit.cinema.facade.UserLogic;
import iit.cinema.interfaces.IUserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

// http://localhost:8080/Cinema-UserLogic-1.1/userLogic/users/

/**
 * Created by Attila on 2015.10.21..
 */
@RestController
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)

public class UserLogicRestController implements IUserLogic {
    @Autowired
    private UserLogic userLogic;

    @Autowired
    private UserResourceAssembler userResourceAssembler;

    @RequestMapping("/users")
    public HttpEntity<Resources<UserResource>> getUsers2() {
        Collection<UserResource> userResourceCollection = new ArrayList<>();
        for (User c : this.userLogic.getUsers()) {
            userResourceCollection.add(userResourceAssembler.toResource(c));
        }
        Resources<UserResource> userResources = new Resources<>(userResourceCollection);
        userResources.add(linkTo(methodOn(UserLogicRestController.class).getUsers()).withSelfRel());
        return new ResponseEntity<>(userResources, HttpStatus.OK);
    }

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
