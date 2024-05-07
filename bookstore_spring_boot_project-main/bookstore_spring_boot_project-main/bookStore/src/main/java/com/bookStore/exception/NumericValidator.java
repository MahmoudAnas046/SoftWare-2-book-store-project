package com.bookStore.exception;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class NumericValidator implements ConstraintValidator<Numeric, String> {

    @Override
    public void initialize(Numeric constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value != null && value.matches("[0-9]+");
    }
}
