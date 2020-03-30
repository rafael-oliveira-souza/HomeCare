package com.homecare.utils.validators.interfaces;

import com.homecare.utils.validators.classes.CepValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = CepValidator.class)
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cep {

    String message() default "Cep inválido";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };

}