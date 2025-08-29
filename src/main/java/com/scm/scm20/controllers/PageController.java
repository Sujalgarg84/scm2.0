package com.scm.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page Handler");
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("YoutubeChannel", "Sujal Garg");
        model.addAttribute("Github","https://github.com/Sujalgarg84");
        return "home";
    }

    // About Route..

    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin","true");
        System.out.println("About page Handler");
        return "about";
    }

    // Services Route..

    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("Services page Handler");
        return "services";
    }


}
