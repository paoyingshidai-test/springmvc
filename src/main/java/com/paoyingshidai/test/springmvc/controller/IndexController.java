package com.paoyingshidai.test.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
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



    // 重定向， 重定向传参
    @RequestMapping("indexPageRedirect")
    public String indexPageRedirect(ModelAndView modelAndView, RedirectAttributes attributes) {
        attributes.addAttribute("test", "hello");
        return "redirect:target";
    }


    @RequestMapping("target")
    @ResponseBody
    public String redirectTarget(@ModelAttribute("test") String test) {
        System.out.println(test);
        return test;
    }

}
