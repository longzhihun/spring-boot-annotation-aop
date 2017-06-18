package com.mypackage.test.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by jlguo on 18/06/2017.
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface Logable {

    String operator() default "nobody";

    String operate() default "doNothing";

}
