package Ru.Conmiro.TrackingSys.controllers;

import Ru.Conmiro.TrackingSys.ModelsRepo.PostRepository;
import Ru.Conmiro.TrackingSys.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SenderController {
    @Autowired
    private PostRepository postRepository;
    @GetMapping("/SenderPage")
    public String SenderMain(Model model){
        model.addAttribute("title", "Cтраница отправителя");
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "sender-page";
    }
}
