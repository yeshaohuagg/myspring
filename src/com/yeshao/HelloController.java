package com.yeshao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap modelMap){
        HashMap<String ,String> map = new HashMap<>();
        map.put("message", "Hello Spring MVC FramWork");
        modelMap.addAllAttributes(map);
        return "/hello";
    }
}
