package pl.mizuirokoala.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {


    //    @ResponseBody
    @RequestMapping("/")
    public String home() {
        return "index";
    }


}
