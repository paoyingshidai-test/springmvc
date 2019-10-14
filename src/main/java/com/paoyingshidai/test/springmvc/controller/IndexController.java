package com.paoyingshidai.test.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("index")
    public String index() {
        return "index";
    }


    @RequestMapping("indexPage")
    public ModelAndView indexPage(ModelAndView modelAndView) {

        List<String> role = Stream.of("admin", "manage").collect(Collectors.toList());

        modelAndView.addObject("roles", role);
        modelAndView.addObject("name", "植荣");
        modelAndView.setViewName("index");

        return modelAndView;
    }

}
