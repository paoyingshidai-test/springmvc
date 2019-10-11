package com.paoyingshidai.test.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("index")
    public String index() {
        return "index";
    }


    @RequestMapping("indexPage")
    public ModelAndView indexPage(ModelAndView modelAndView) {

        modelAndView.addObject("name", "植荣");
        modelAndView.setViewName("index");

        return modelAndView;
    }

}
