package com.mate.spring.controller;


import com.mate.spring.model.User;
import com.mate.spring.service.RoleService;
import com.mate.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @RequestMapping("/login")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("login", "user", new User());
        return mv;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("user") User user) {
        userService.getUserByName(user.getUsername());
        ModelAndView mv = new ModelAndView();
        mv.addObject(user);
        mv.setViewName("welcome");
        return mv;
    }

    @RequestMapping("/register")
    public ModelAndView register() {
        ModelAndView mv = new ModelAndView("register", "user", new User());
        return mv;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register(@ModelAttribute("user") User user) {
        ModelAndView mv = new ModelAndView();
        user.setRole(roleService.getRoleByRoleName("USER"));   //TO DO externalize to property file
        userService.addUser(user);
        mv.addObject(user);
        mv.setViewName("welcome");
        return mv;
    }
}