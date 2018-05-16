package com.zhouyh.myspringboot.domain.jpa;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author: zhouyh
 * @Date: 2018-03-14 10:48
 * @Description:
 */

public class UserTest{
    public static void main(String[] args) {
        User xiaoming = getBean();
        List<String> validate = validate(xiaoming);
        for(String item:validate){
            System.out.println(item);
        }
//        validate.forEach(row -> {
//            System.out.println(row.toString());
//        });

    }

    private static User getBean() {
        User bean = new User();
        bean.setAge(12);
        bean.setName("--");
        return bean;
    }

    private static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    public static <T> List<String> validate(T t) {
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);

        List<String> messageList = new ArrayList<>();
        for (ConstraintViolation<T> constraintViolation : constraintViolations) {
            messageList.add(constraintViolation.getMessage());
        }
        return messageList;
    }
}