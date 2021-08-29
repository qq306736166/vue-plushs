package com.interfase;

import com.entity.VuePlushEntity;
import jdk.jfr.Description;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Description(value = "vueconfig")
public @interface VuePlushConfig {

    VuePlushEntity vue = new VuePlushEntity();

    String project_name() default "";

    String project_version() default "";

    String project_author() default "";

    String project_description() default "";

    boolean project_debug() default false;

}
