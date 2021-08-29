package com;

import com.controller.Vue;
import com.entity.VuePlushEntity;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Vue.vue_run(VuePlushEntity.vue);
    }

}
