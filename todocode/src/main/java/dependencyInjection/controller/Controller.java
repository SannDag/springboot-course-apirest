package dependencyInjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import dependencyInjection.model.Post;
import dependencyInjection.repository.IPostRepository;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    IPostRepository postRepo;

    @GetMapping("/posts")
    public List<Post> getPosts(){
        return postRepo.getPosts();
    }

}
