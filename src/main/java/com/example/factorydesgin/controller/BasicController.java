package com.example.factorydesgin.controller;

import com.example.factorydesgin.factory.ServiceFactory;
import com.example.factorydesgin.service.impl.ProjectAService;
import com.example.factorydesgin.service.impl.ProjectBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {

    private final ProjectAService projectAService;
    private final ProjectBService projectBService;

    /**
     * 当一个类（BasicController）带有@Autowired注解的构造函数时，Spring 会自动尝试查找与构造函数参数类型匹配的组件（Bean）。
     * 对于ServiceFactory，他被标记为@Service，所以可以被找到
     * @param serviceFactory
     */
    @Autowired
    public BasicController(ServiceFactory serviceFactory) {
        this.projectAService = serviceFactory.getProjectAService();
        this.projectBService = serviceFactory.getProjectBService();
    }

    @GetMapping("/proACreateOne")
    @ResponseBody
    public String proACreate() {
        return projectAService.createOne();
    }

    @GetMapping("/proBCreateOne")
    @ResponseBody
    public String proBCreate() {
        return projectBService.createOne();
    }

    @GetMapping("/proBCreateTwo")
    @ResponseBody
    public String proBCreateTwo() {
        return projectBService.createTwo();
    }
}
