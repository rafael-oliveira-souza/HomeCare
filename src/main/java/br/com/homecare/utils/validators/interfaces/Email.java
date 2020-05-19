package br.com.homecare.utils.validators.interfaces;

import java.lang.annotation.ElementType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import br.com.homecare.utils.validators.classes.EmailValidator;

@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
public @interface Email {
 String message() default "Email inválido";
 Class<?>[] groups() default {};
 Class<? extends Payload>[] payload() default {};
}