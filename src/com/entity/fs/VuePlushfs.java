package com.entity.fs;

import com.interfase.VuePlushInter;
import com.interfase.VuePlushConfig;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import jdk.jfr.Description;
import com.entity.pro.VuePlushPro;
import java.lang.annotation.Annotation;
import java.util.logging.Level;
import java.util.logging.LogRecord;

@Description(value = "vueconfig")
public class VuePlushfs implements VuePlushConfig {

    private VuePlushPro vue = new VuePlushPro();
    private VuePlushInter interfase;
    private String Project_Name = vue.getProject_Name();
    private String Project_Version = vue.getProject_Version();
    private String Project_Author = vue.getProject_Author();
    private String Project_Description = vue.getProject_Description();
    private Logger logger = LoggerFactory.getLogger(VuePlushfs.class);

    public VuePlushfs() {

    }


    public String getProject_Name() {
        return Project_Name;
    }

    public void setProject_Name(String project_Name) {
        if (Project_Name.isEmpty()) {
            LogRecord logRecord = new LogRecord(Level.parse("project name is not find"),"msg");
            logRecord.getMessage();
        }else{
            Project_Name = project_Name;
        }
    }

    public String getProject_Version() {
        return Project_Version;
    }

    public void setProject_Version(String project_Version) {
        if (Project_Version.isEmpty()) {
            LogRecord logRecord = new LogRecord(Level.parse("project version is not find"),"msg");
            logRecord.getMessage();
        }else{
            Project_Version = project_Version;
        }
    }

    public String getProject_Author() {
        return Project_Author;
    }

    public void setProject_Author(String project_Author) {
        if (project_Author.isEmpty()) {
            LogRecord logRecord = new LogRecord(Level.parse("project author is not find"),"msg");
            logRecord.getMessage();
        }else{
            Project_Author = project_Author;
        }
    }


    public String ProjectName() {
        return Project_Name;
    }

    public String Project_Version() {
        return Project_Version;
    }

    public String Project_Author() {
        return Project_Author;
    }

    public String Project_Description() {
        return Project_Description;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    @Override
    public String project_name() {
        return ProjectName();
    }

    @Override
    public String project_version() {
        return Project_Version();
    }

    @Override
    public String project_author() {
        return Project_Author();
    }

    @Override
    public String project_description() {
        return Project_Description();
    }

    @Override
    public boolean project_debug() {
        return false;
    }
}
