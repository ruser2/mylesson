package com.zhouyh.myspringboot.validator;

import com.zhouyh.myspringboot.enums.ErrorEnum;
import com.zhouyh.myspringboot.response.Response;
import com.zhouyh.myspringboot.response.ResponseUtil;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @Author: zhouyh
 * @Date: 2018-03-14 17:32
 * @Description:
 */
public class ParamValidator {
    private static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    public static <T> List<String> validate(T t) {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);

        List<String> messageList = new ArrayList<>();
        for (ConstraintViolation<T> constraintViolation : constraintViolations) {
            messageList.add(constraintViolation.getMessage());
        }
        return messageList;
    }

    public static <T> StringBuffer validateToStr(T t) {
        Set<ConstraintViolation<T>> constraintViolations = validator.validate(t);
        StringBuffer stringBuffer=new StringBuffer();
        for (ConstraintViolation<T> constraintViolation : constraintViolations) {
            stringBuffer.append(constraintViolation.getMessage());
            stringBuffer.append(";");
        }
        return stringBuffer;
    }

    public static Response validate(Object[]args) {
        StringBuffer stringBuffer=new StringBuffer();
        for (Object o : args) {
            if (o == null) {
                //可以在这里排除部分
                continue;
            }
            StringBuffer item=validateToStr(o);
            if(item.length()>0){
                stringBuffer.append(";");
                stringBuffer.append(validateToStr(o));
            }
        }
        if(stringBuffer.length()>0){
            return ResponseUtil.fail(ErrorEnum.PARAM_ERROR.getCode(),stringBuffer.toString());
        }
        return null;
    }
}
