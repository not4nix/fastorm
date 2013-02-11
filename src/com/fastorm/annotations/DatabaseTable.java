package com.fastorm.annotations;

import javax.inject.Inject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.TYPE;

@Target({TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DatabaseTable {

    public String tableName() default "";

    @Inject
    public Constraint[] constraints() default {};
}
