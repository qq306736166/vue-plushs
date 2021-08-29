package com.entity;

import com.interfase.VuePlushConfig;

import java.lang.annotation.Annotation;
import java.util.Map;

public class VuePlushEntity implements VuePlushConfig {


    public VuePlushEntity(){}

    private String Project_Name;
    private String Project_Version;
    private String Project_Author;
    private Boolean Project_Debug;
    private String Project_Description;
    private Boolean Project_Private;
    private Map<String,Object> Project_Scripts;
    private Map<String,Object> Project_Dependencies;
    private Map<String,Object> Project_DevDependencies;
    private Map<String,Object> Project_Engines;
    private Map<String,Object> Project_Browserslist;

    public String getProject_Name() {
        return Project_Name;
    }

    public String setProject_Name(String project_Name) {
        Project_Name = project_Name;
        return project_Name;
    }

    public String getProject_Version() {
        return Project_Version;
    }

    public String setProject_Version(String project_Version) {
        Project_Version = project_Version;
        return project_Version;
    }

    public String getProject_Author() {
        return Project_Author;
    }

    public String setProject_Author(String project_Author) {
        Project_Author = project_Author;
        return project_Author;
    }

    public Boolean getProject_Debug() {
        return Project_Debug;
    }

    public Boolean setProject_Debug(Boolean project_Debug) {
        Project_Debug = project_Debug;
        return project_Debug;
    }

    public String getProject_Description() {
        return Project_Description;
    }

    public String setProject_Description(String project_Description) {
        Project_Description = project_Description;
        return project_Description;
    }

    public Boolean getProject_Private() {
        return Project_Private;
    }

    public Boolean setProject_Private(Boolean project_Private) {
        Project_Private = project_Private;
        return project_Private;
    }

    public Map<String, Object> getProject_Scripts() {
        return Project_Scripts;
    }

    public Map<String, Object> setProject_Scripts(Map<String, Object> project_Scripts) {
        Project_Scripts = project_Scripts;
        return project_Scripts;
    }

    public Map<String, Object> getProject_Dependencies() {
        return Project_Dependencies;
    }

    public void setProject_Dependencies(Map<String, Object> project_Dependencies) {
        Project_Dependencies = project_Dependencies;
    }

    public Map<String, Object> getProject_DevDependencies() {
        return Project_DevDependencies;
    }

    public Map<String, Object> setProject_DevDependencies(Map<String, Object> project_DevDependencies) {
        Project_DevDependencies = project_DevDependencies;
        return project_DevDependencies;
    }

    public Map<String, Object> getProject_Engines() {
        return Project_Engines;
    }

    public Map<String, Object> setProject_Engines(Map<String, Object> project_Engines) {
        Project_Engines = project_Engines;
        return project_Engines;
    }

    public Map<String, Object> getProject_Browserslist() {
        return Project_Browserslist;
    }

    public Map<String, Object> setProject_Browserslist(Map<String, Object> project_Browserslist) {
        Project_Browserslist = project_Browserslist;
        return project_Browserslist;
    }

    @Override
    public String toString() {
        return "VuePlushEntity{" +
                "Project_Name='" + Project_Name + '\'' +
                ", Project_Version='" + Project_Version + '\'' +
                ", Project_Author='" + Project_Author + '\'' +
                ", Project_Debug=" + Project_Debug +
                ", Project_Description='" + Project_Description + '\'' +
                ", Project_Private=" + Project_Private +
                ", Project_Scripts=" + Project_Scripts +
                ", Project_Dependencies=" + Project_Dependencies +
                ", Project_DevDependencies=" + Project_DevDependencies +
                ", Project_Engines=" + Project_Engines +
                ", Project_Browserslist=" + Project_Browserslist +
                '}';
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return (Class<? extends Annotation>) VuePlushEntity.class;
    }


    public String ProjectName() {
        return this.getProject_Name();
    }

    public String Project_Version() {
        return this.getProject_Version();
    }

    public String Project_Author() {
        return this.getProject_Author();
    }

    public String Project_Description() {
        return this.getProject_Description();
    }

    @Override
    public String project_name() {
        return Project_Name;
    }

    @Override
    public String project_version() {
        return Project_Version;
    }

    @Override
    public String project_author() {
        return Project_Author;
    }

    @Override
    public String project_description() {
        return Project_Description;
    }

    @Override
    public boolean project_debug() {
        return false;
    }
}
