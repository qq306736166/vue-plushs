package com.controller;

import java.io.*;
import java.nio.ByteBuffer;

public class VueTemplate extends VueDictionary{

    public VueTemplate() {
        super();
    }
    String template_start = "<template>\r\n\r";
    String script_start = "<script>\r\n\r";
    String vue_data = "export default{\r\n\r"+
            "data(){return{}}\r\n\r"+
            "}\r\n\r";
    String script_end = "</script>\r\n\r";
    String template_end = "</template>\r\n\r";
    ByteBuffer byteBuffer = ByteBuffer.allocate(102400);


    public void create_template(String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        byte[] bytes = new byte[32];
        String[] tmp = {template_start, script_start,vue_data,script_end,template_end};
        byteBuffer = ByteBuffer.wrap(bytes);
        for (int i = 0; i < tmp.length; i++){
            fileOutputStream.write(tmp[i].getBytes());
        }
        byteBuffer = ByteBuffer.wrap(bytes);
        fileOutputStream.close();
    }
}
