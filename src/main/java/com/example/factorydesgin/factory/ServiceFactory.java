package com.example.factorydesgin.factory;

import com.example.factorydesgin.service.impl.ProjectAService;
import com.example.factorydesgin.service.impl.ProjectBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ServiceFactory {
    @Autowired
    private ApplicationContext applicationContext;
    @Value("${project.projectAID}")
    String projectAID;

    /**
     * 创建bean
     * @return
     */
    @Bean
    public ProjectAService createProjectAService() {
        return new ProjectAService(projectAID);
    }

    /**
     * 获取bean
     * @return
     */
    public ProjectAService getProjectAService(){
        return applicationContext.getBean(ProjectAService.class);
    }

    @Value("${project.projectBID}")
    String projectBID;

    @Bean
    public ProjectBService createProjectBService() {
        return new ProjectBService(projectBID);
    }

    public ProjectBService getProjectBService(){
        return applicationContext.getBean(ProjectBService.class);
    }
}
