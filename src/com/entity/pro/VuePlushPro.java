package com.entity.pro;

import java.util.HashMap;
import java.util.Map;

public class VuePlushPro {

    public VuePlushPro(){}

    protected String Project_Name;
    protected String Project_Version;
    protected String Project_Author;
    protected String Project_Debug;
    protected Map<String,Object> Project_Script;

    public Map<String, Object> getProject_Script() {
        return Project_Script;
    }

    public void setProject_Script(String scripts, Object str) {
            Map<String,Object> map = new HashMap<>();
            map.put(scripts,str);
            Project_Script = map;
    }

    public String getProject_Name() {
        return Project_Name;
    }

    public void setProject_Name(String project_Name) {
        Project_Name = project_Name;
    }

    public String getProject_Version() {
        return Project_Version;
    }

    public void setProject_Version(String project_Version) {
        Project_Version = project_Version;
    }

    public String getProject_Author() {
        return Project_Author;
    }

    public void setProject_Author(String project_Author) {
        Project_Author = project_Author;
    }

    public String getProject_Debug() {
        return Project_Debug;
    }

    public void setProject_Debug(String project_Debug) {
        Project_Debug = project_Debug;
    }

    public String getProject_Description() {
        return Project_Description;
    }

    public void setProject_Description(String project_Description) {
        Project_Description = project_Description;
    }

    public String getProject_Private() {
        return Project_Private;
    }

    public void setProject_Private(String project_Private) {
        Project_Private = project_Private;
    }

    public String getProject_Scripts() {
        return Project_Scripts;
    }

    public void setProject_Scripts(String project_Scripts) {
        Project_Scripts = project_Scripts;
    }

    public String getProject_Dependencies() {
        return Project_Dependencies;
    }

    public void setProject_Dependencies(String project_Dependencies) {
        Project_Dependencies = project_Dependencies;
    }

    public String getProject_DevDependencies() {
        return Project_DevDependencies;
    }

    public void setProject_DevDependencies(String project_DevDependencies) {
        Project_DevDependencies = project_DevDependencies;
    }

    public String getProject_Engines() {
        return Project_Engines;
    }

    public void setProject_Engines(String project_Engines) {
        Project_Engines = project_Engines;
    }

    public String getProject_Browserslist() {
        return Project_Browserslist;
    }

    public void setProject_Browserslist(String project_Browserslist) {
        Project_Browserslist = project_Browserslist;
    }

    protected String Project_Description;



    protected String Project_Private;
    protected String Project_Scripts;
    protected String Project_Dependencies;
    protected String Project_DevDependencies;
    protected String Project_Engines;
    protected String Project_Browserslist;



}
