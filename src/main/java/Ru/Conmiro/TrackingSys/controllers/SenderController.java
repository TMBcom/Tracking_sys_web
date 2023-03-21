package Ru.Conmiro.TrackingSys.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SenderController {
    @GetMapping("/SenderPage")
    public String SenderMain(Model model){
        model.addAttribute("title", "Cтраница отправителя");
        return "sender-page";
    }
}
