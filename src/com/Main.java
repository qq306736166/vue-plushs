package com;

import com.controller.Vue;
import com.controller.VueTemplate;
import com.entity.VuePlushEntity;
import com.interfase.VuePlushConfig;

import java.io.IOException;


@VuePlushConfig(project_name = "vue-plush",project_author = "dismans",project_version = "v1.0.0",project_description = "vue",project_debug = true)
public class Main {

    public static void main(String[] args) throws IOException {
        Vue.vue_init(VuePlushEntity.vue);
        Vue.vue_run(new VueTemplate(),new Object());
    }

}
