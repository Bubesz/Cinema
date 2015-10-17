package iit.cinema.controller;

import iit.cinema.entity.User;
import iit.cinema.facade.ServiceFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Attila on 2015.10.03..
 */
@Controller
@RequestMapping(method = RequestMethod.GET)
public class IndexController {

    @Autowired
    private ServiceFacade service;

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    // TODO child module scope to provided ? use eclipselink and springframework modules

    @RequestMapping("/users")
    public String users(Model model) {
        List<User> users = service.getUserLogic().getUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }
}
