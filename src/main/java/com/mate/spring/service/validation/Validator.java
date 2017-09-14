package com.mate.spring.service.validation;

public interface Validator<T> {

    boolean validate(T t);

}
