package com.example.factorydesgin.service.impl;

import com.example.factorydesgin.service.base.AbstractProService;

public class ProjectBService extends AbstractProService {
    public ProjectBService(String projectId) {
        super(projectId);
    }

    @Override
    public String createTwo() {
        return "子类重写："+ super.createTwo();
    }
}
