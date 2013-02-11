package com.fastorm.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;

@Target({METHOD, FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraint {

    public String[] columns();
}
