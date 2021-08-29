package com.controller;

import com.interfase.VueDictionarys;
import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
import com.sun.tools.javac.util.StringUtils;
import sun.awt.Symbol;

public class VueDictionary extends StringUtils {

    public VueDictionary() {

    }

    @VueDictionarys(type = "type", value = "String")
    private String string() {
        return "";
    }

    @VueDictionarys(type = "type", value = "Number")
    private Integer number() {
        return 0;
    }

    @VueDictionarys(type = "type", value = "Function")
    private Object function() {
        return new Object();
    }

    @VueDictionarys(type = "type", value = "Undefined")
    private String undefined() {
        return "undefined";
    }

    @VueDictionarys(type = "type", value = "Symbol")
    private Symbol symbol() {
        return new Symbol();
    }

    @VueDictionarys(type = "type", value = "map")
    private Object map() {
        return new Object();
    }

    @VueDictionarys(type = "type", value = "error")
    private Error error() {
        return new Error();
    }

    @VueDictionarys(type = "hexToBinary", value = "hexToBinaryDic")
    private HexBin hexBin() {
        return new HexBin();
    }
}
