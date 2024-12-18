package com.example.factorydesgin.service.base;

import com.example.factorydesgin.service.api.ProjectInterface;

public abstract class AbstractProService implements ProjectInterface {
    protected String projectId;

    public AbstractProService(String projectId){
        this.projectId = projectId;
    }

    public String createOne(){
        return projectId;
    }

    public String createTwo(){
        return projectId;
    }
}
