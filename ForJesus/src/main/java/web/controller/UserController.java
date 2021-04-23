package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.RoleService;
import web.service.UserService;



@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @GetMapping
    public String getHomePage() {
        return "home_page";
    }

}


//    @GetMapping
//    public String getHomePageForAnonim(){
//
//    }

