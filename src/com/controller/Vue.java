package com.controller;

import com.entity.VuePlushEntity;
import jdk.jfr.Description;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@Description(value = "package")
public class Vue extends Package {

    public static void vue_run(Object object) throws IOException {
        Package pack = new Package();
        pack.doFile();
        if (null == object) {
        }
        ConcurrentMap<String, Object> concurrentMap = new ConcurrentHashMap<>();
        boolean is = object.getClass().isAnnotationPresent(VuePlushEntity.class);
        if (is) {
            VuePlushEntity vuePlush = object.getClass().getAnnotation(VuePlushEntity.class);
            if (vuePlush.equals(concurrentMap)) {
                concurrentMap.put(object.getClass().getSimpleName(), object.getClass().getSimpleName());
            } else {
                concurrentMap.put(object.getClass().getSimpleName(), object.getClass().getName());
            }
        } else {
            new Vue();
        }
    }

}
