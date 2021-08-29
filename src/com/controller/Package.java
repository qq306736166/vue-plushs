package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.interfase.VuePlushConfig;
import com.interfase.pro.VuePlushPro;
import com.utils.PackJsonFile;
import java.io.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Package extends PackJsonFile {


    @VuePlushConfig(project_name = "vue-plush",project_author = "dismans",project_version = "v1.0.0",project_description = "vue",project_debug = true)
    private String ProjectName;
    private String Project_Version;
    private String Project_Author;
    private String Project_Description;
    private String Project_Debug;

    public void doFile() throws IOException {
        PackJsonFile json = new PackJsonFile();
        JSONObject object = new JSONObject();
        Field[] fields = Package.class.getDeclaredFields();
        for(Field field : fields){
            boolean fieldHas = field.isAnnotationPresent(VuePlushConfig.class);
            if(fieldHas){
                VuePlushConfig product = field.getAnnotation(VuePlushConfig.class);
                object.put("name", product.project_name());
                object.put("author", product.project_author());
                object.put("version", product.project_version());
                object.put("description", product.project_description());
                object.put("debug", product.project_debug());
            }
        }
        Map<String,Object> map = new HashMap<>();
        map.put("dev","webpack-dev-server --inline --progress --config build/webpack.dev.conf.js");
        map.put("start","npm run dev");
        map.put("build","node build/build.js");
        object.put("scripts",map);
        Map<String,Object> map1 = new HashMap<>();
        map1.put("autoprefixer","^7.1.2");
        map1.put("babel-core","^6.22.1");
        map1.put("babel-helper-vue-jsx-merge-props","^2.0.3");
        map1.put("babel-loader","^7.1.1");
        map1.put("babel-plugin-syntax-jsx","^6.18.0");
        map1.put("babel-plugin-transform-runtime","^6.22.0");
        map1.put("chalk","^2.0.1");
        map1.put("copy-webpack-plugin","^4.0.1");
        map1.put("css-loader","^0.28.0");
        map1.put("extract-text-webpack-plugin","^3.0.0");
        map1.put("file-loader","^1.1.4");
        map1.put("friendly-errors-webpack-plugin","^1.6.1");
        map1.put("html-webpack-plugin","^2.30.1");
        map1.put("node-notifier","^5.1.2");
        map1.put("optimize-css-assets-webpack-plugin","^3.2.0");
        map1.put("ora","^1.2.0");
        map1.put("portfinder","^1.0.13");
        map1.put("postcss-import","^11.0.0");
        map1.put("postcss-loader","^2.0.8");
        map1.put("postcss-url","^7.2.1");
        map1.put("rimraf","^2.6.0");
        map1.put("semver","^5.3.0");
        map1.put("shelljs","^0.7.6");
        map1.put("uglifyjs-webpack-plugin","^1.1.1");
        map1.put("url-loader","^0.5.8");
        map1.put("vue-loader","^13.3.0");
        map1.put("vue-style-loader","^3.0.1");
        map1.put("vue-template-compiler","^2.5.2");
        map1.put("webpack","^3.6.0");
        map1.put("webpack-cli","^4.8.0");
        map1.put("webpack-bundle-analyzer","^2.9.0");
        map1.put("webpack-dev-server","^2.11.5");
        map1.put("webpack-merge","^4.1.0");
        object.put("devDependencies",map1);
        Map<String,Object> map2 = new HashMap<>();
        map2.put("compression-webpack-plugin","^8.0.1");
        map2.put("vue","^2.5.2");
        map2.put("vue-router","^3.0.1");
        object.put("dependencies",map2);
        object.put("browserslist", VuePlushPro.Project_Browserslist);
        object.put("engines", VuePlushPro.Project_Engines);
        OutputStreamWriter io = new OutputStreamWriter(new FileOutputStream("./web/package.json"), "UTF-8");
        json.PackageJsonFile(io, object);
    }

    public Package() {

    }

}
