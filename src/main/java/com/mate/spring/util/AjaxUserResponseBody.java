package com.mate.spring.util;

import com.fasterxml.jackson.annotation.JsonView;
import com.mate.spring.model.User;

import java.util.List;

public class AjaxUserResponseBody {

    @JsonView(View.Public.class)
    private List<User> userList;

    @JsonView(View.Public.class)
    private String message;

    @JsonView(View.Public.class)
    private String responseCode;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
}
