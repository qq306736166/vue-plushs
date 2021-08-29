package com.controller;

public class VueTemplate extends VueDictionary{

    public VueTemplate(Object object) throws NoSuchMethodException {
        super(object.getClass().getMethod("com.controller.*",VueDictionary.class));
    }

    private VueDictionary vueDictionary = new VueDictionary(this.getClass().getMethod("com.controller.*",VueTemplate.class));

    public void setVueDictionary(VueDictionary vueDictionary) {
        this.vueDictionary = vueDictionary;
    }

    public VueDictionary getVueDictionary() {
        return vueDictionary;
    }
}
