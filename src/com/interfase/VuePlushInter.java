package com.interfase;

import com.sun.istack.internal.NotNull;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface VuePlushInter{

    String project_name();

    String project_version();

    String project_author();

    boolean project_debug();

}
