package com.interfase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Map;

@Target(ElementType.METHOD)
public @interface VueDictionarys {

    String type() default "";

    String value() default "";

}
