package com.mate.spring.controller;

import com.mate.spring.model.User;
import com.mate.spring.service.UserService;
import com.mate.spring.util.AjaxUserFieldResponse;
import com.mate.spring.util.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class AjaxController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/api/registration", method = RequestMethod.POST, consumes = "application/json")
    public AjaxUserFieldResponse userRegisterInputValidation(@RequestBody SearchCriteria searchCriteria) {
        AjaxUserFieldResponse responseBody = new AjaxUserFieldResponse();
        if(searchCriteria.getParamName().equals("name")) {
            User result = userService.getUserByName(searchCriteria.getParam());
            responseBody.setAvailable(result != null);
            responseBody.setCode("200");
            return responseBody;
        }
        if(searchCriteria.getParamName().equals("email")) {
            User result = userService.getUserByEmail(searchCriteria.getParam());
            responseBody.setAvailable(result != null);
            responseBody.setCode("200");
            return responseBody;
        }
        responseBody.setCode("400");
        return responseBody;

    }

}