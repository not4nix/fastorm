package com.fastorm.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.FIELD;

@Target({METHOD, FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

    public String name() default "";

    public boolean isUnique() default false;

    public boolean isNullable() default false;

    public boolean isInsertable() default false;

    public String definition() default "";

    public String table() default "";

    public int length() default 255;

    public int precision() default 0;

    public int scale() default 0;
}
