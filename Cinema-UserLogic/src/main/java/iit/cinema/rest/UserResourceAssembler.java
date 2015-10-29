package iit.cinema.rest;

import iit.cinema.entity.User;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

/**
 * Created by Attila on 2015. 10. 29..
 */
@Component
public class UserResourceAssembler extends ResourceAssemblerSupport<User,UserResource> {
    //public static final String FIELD_REL = "field";

    public UserResourceAssembler() {
        super(UserLogicRestController.class, UserResource.class);
    }

    @Override
    public UserResource toResource(User user) {
        UserResource resource = createResourceWithId(user.getUserId(), user);
        //TODO is self created? (there's no getUser() method, what is self?)

        // … do further mapping
        //Link fieldLink = linkTo(methodOn(controllerClass).loadUser( userId)).withRel(FIELD_REL);
        //userResource.add(fieldLink);
        return resource;
    }
}
