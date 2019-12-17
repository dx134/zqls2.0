package com.duanxin.zqls.web.validate;

import com.baidu.unbiz.fluentvalidator.ValidationError;
import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;

/**
 * 长度校验
 * @author duanxin
 * @version 1.0
 * @date 2019/10/14 9:08
 */
public class LengthValidator extends ValidatorHandler<String> implements Validator<String> {

    private int min;

    private int max;

    private String fieldName;

    public LengthValidator(int min, int max, String fieldName) {
        this.min = min;
        this.max = max;
        this.fieldName = fieldName;
    }

    @Override
    public boolean validate(ValidatorContext context, String s) {
        if (null == s || s.length() >= max || s.length() <= min) {
            context.addError(ValidationError.create(String.format("%s长度必须介于%s~%s之间！",
                    fieldName, min, max))
                    .setErrorCode(-1)
                    .setField(fieldName)
                    .setInvalidValue(s));
            return false;
        }

        return true;
    }
}