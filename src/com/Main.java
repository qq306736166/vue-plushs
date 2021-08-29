package com;

import com.controller.Vue;
import com.controller.VueTemplate;
import com.entity.VuePlushEntity;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Vue.vue_init(VuePlushEntity.vue);
        Vue.vue_run(new VueTemplate(),new Object());
    }

}
