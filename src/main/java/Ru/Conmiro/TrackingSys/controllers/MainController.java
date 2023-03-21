package Ru.Conmiro.TrackingSys.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String IndexPage(Model model) {
        model.addAttribute("title", "Главная страница");
        return "index";
    }

    @GetMapping("/RecipientPage")
    public String RecipientPage(Model model) {
        model.addAttribute("title", "Страница получателя");
        return "recipient-page";
    }
}