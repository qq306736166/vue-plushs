package com.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;

public class JsonUtil {


    public static String StringClearD(String str) {
        String regex = "^,*|,*$";
        String str1 = str.replaceAll(regex, "");
        return str1;
    }


    public static String StringClearDy(String str) {

        String str1 = str.replaceAll("\"", "");
        return str1;
    }

    /**
     * json字符 转list
     *
     * @param str
     * @return
     */
    public static List<Map> JsonStringToList(String str) {
        List<Map> listQcPlate = new ArrayList<Map>();
        listQcPlate = JSON.parseArray(str, Map.class);
        return listQcPlate;

    }

    /**
     * 字符
     *
     * @param str
     * @return
     */
    public static List<Integer> JsonStringToArrary(String str) {
        List<Integer> listQcPlate = new ArrayList<Integer>();

        listQcPlate = JSON.parseArray(str, Integer.class);
        return listQcPlate;

    }

    public static List<String> JsonStringToArrary2(String str) {
        List<String> listQcPlate = new ArrayList<String>();

        listQcPlate = JSON.parseArray(str, String.class);
        return listQcPlate;

    }
}
