package tn.mi.spring.entities;



import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.primefaces.validate.bean.ClientConstraint;

//@Target({METHOD,FIELD,ANNOTATION_TYPE})
//@Retention(RUNTIME)
//@Constraint(validatedBy=EmailConstraintValidator.class)
@ClientConstraint(resolvedBy=EmailConstraintValidator.class)
@Documented
public @interface Email {

    String message() default "{org.primefaces.examples.primefaces}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
