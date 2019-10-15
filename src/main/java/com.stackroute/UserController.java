package com.stackroute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @PostMapping("/show")
    public ModelAndView getName(HttpServletRequest req){
        String a= (String)req.getParameter("Username");
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("VALUE", a);
        return  modelAndView;
    }

}
