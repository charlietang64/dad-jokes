package com.example.dadjokes.controller;

import com.example.dadjokes.domain.DadJoke;
import com.example.dadjokes.service.DadJokeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DadJokeController {
    private DadJokeService service;

    public DadJokeController(DadJokeService service) {
        this.service = service;
    }

    @GetMapping("jokes")
    public List<DadJoke> all() {
        return service.getAll();
    }

    @PostMapping("jokes")
    public void add(DadJoke newJoke) {
        service.add(newJoke);
    }

    @PutMapping("jokes/{id}")
    public void update(@PathVariable int id,
                       @RequestBody String updatedJoke) {
        service.update(id, updatedJoke);
    }

    @DeleteMapping("jokes/{id}")
    public void deleteJoke(@PathVariable int id) {
        service.delete(id);
    }
}
