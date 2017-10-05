package com.mate.spring.util;

public class AjaxUserFieldResponse {

    String code;

    boolean isAvailable;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
