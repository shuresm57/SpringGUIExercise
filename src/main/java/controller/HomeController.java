package controller;

import model.Animal;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
@ComponentScan(basePackages = "controller")
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("/animals")
    public String personData(@ModelAttribute Animal animal, Model model){
        model.addAttribute("animal", animal);
        return "animals";
    }
}
