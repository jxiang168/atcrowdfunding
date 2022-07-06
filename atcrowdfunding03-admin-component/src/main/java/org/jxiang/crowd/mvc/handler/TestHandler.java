package org.jxiang.crowd.mvc.handler;

import org.jxiang.crowd.entity.Admin;
import org.jxiang.crowd.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * TODO
 *
 * @author Jxiang
 * @version 1.0
 * @create 2022-07-06 13:44
 */
@Controller
public class TestHandler {

    @Autowired
    AdminService adminService;

    @GetMapping("/test/ssm.html")
    public String testSsm(ModelMap modelMap) {
        List<Admin> adminList = adminService.getAll();
        modelMap.addAttribute("adminList",adminList);
        return "target";
    }
}
