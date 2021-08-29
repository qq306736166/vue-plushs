package com.utils;

import com.alibaba.fastjson.JSONObject;
import java.io.*;

public class PackJsonFile {


    public void PackageJsonFile(OutputStreamWriter osw,JSONObject object) throws IOException {
        osw.write(object.toString().trim());
        osw.flush();
        osw.close();
    }


}
