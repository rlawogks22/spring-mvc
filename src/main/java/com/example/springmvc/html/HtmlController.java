package com.example.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    private static long visitCount  = 0;//카운트
    @GetMapping("/static-hello")
    public String hello(){
        return "hello html";
    }

    @GetMapping("/html/redirect")//정적
    public String htmlStatic(){
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")//동적
    public String htmlTemplates(){
        return "hello";
    }

    @GetMapping("/html/dynamic")//동적
    public String htmlDynamic(Model model){
        visitCount++;
        model.addAttribute("visits",visitCount);
        return "hello-visit";
    }

}
