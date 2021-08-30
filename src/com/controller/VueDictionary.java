package com.controller;

import com.interfase.VueDictionarys;
import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
import com.sun.tools.javac.util.StringUtils;
import sun.awt.Symbol;

public class VueDictionary extends StringUtils {

    public VueDictionary() {
        StringUtils stringUtils = new StringUtils();
        stringUtils.getClass().getClassLoader();
    }

    @VueDictionarys(type = "type", value = "@String")
    public String string() {
        return "string";
    }

    @VueDictionarys(type = "type", value = "@Number")
    public Integer number() {
        return 0;
    }

    @VueDictionarys(type = "type", value = "@Function")
    public Object function() {
        return new Object();
    }

    @VueDictionarys(type = "type", value = "@Undefined")
    public String undefined() {
        return "undefined";
    }

    @VueDictionarys(type = "type", value = "@Symbol")
    public Symbol symbol() {
        return new Symbol();
    }

    @VueDictionarys(type = "type", value = "@map")
    public Object map() {
        return new Object();
    }

    @VueDictionarys(type = "type", value = "@error")
    public Error error() {
        return new Error();
    }

    @VueDictionarys(type = "toType", value = "@hexToBinaryDic")
    public HexBin hexBin() {
        return new HexBin();
    }

    @VueDictionarys(type = "doType", value = "@isString")
    public Boolean isString() {
        return false;
    }

    @VueDictionarys(type = "doType", value = "@isNumber")
    public Boolean isNumber() {
        return false;
    }

    @VueDictionarys(type = "doType", value = "@isFunction")
    public Boolean isFunction() {
        return false;
    }

    @VueDictionarys(type = "doType", value = "isObject")
    public Boolean isObject() {
        return false;
    }


}
