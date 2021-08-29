package com.interfase.pro;

import com.entity.pro.VuePlushPro;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
public @interface VuePlushfase {

    VuePlushPro vue = new VuePlushPro();

}
