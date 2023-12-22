package kr.allparking.bpm_AllParking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/me")
    public String me(){
        return "me";

    }
    @GetMapping("/team")
    public String team(){
        return "team";
    }
    @GetMapping("/location")
    public String location(){
        return "location";
    }

}
