package com.bookStore.exception;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NumericValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Numeric {
    String message() default "Field must contain only numeric characters";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
