package ru.yandex.practicum.catsgram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.yandex.practicum.catsgram.model.Post;
import ru.yandex.practicum.catsgram.service.PostService;

import java.util.List;

@RestController
public class PostController {

    //Чтобы вызывать методы из контроллера, у него должен быть доступ к классу с логикой.
    // То есть PostService должен стать зависимостью для PostController
    private final PostService postService;

    //Для этого добавим в PostController поле postService и конструктор, принимающий сервис как параметр.
    //Конструктор пометим аннотацией @Autowired
    @Autowired
    //Это значит, что здесь произойдёт внедрение зависимостей — создание PostService
    // и его передача в PostContoller произойдёт автоматически.
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> findAll() {
        return postService.findAll();
    }

    @PostMapping(value = "/post")
    public Post create(@RequestBody Post post) {
        return postService.create(post);
    }
}
