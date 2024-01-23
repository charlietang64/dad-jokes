package com.example.dadjokes.service;

import com.example.dadjokes.db.DadJokeRepository;
import com.example.dadjokes.domain.DadJoke;

import java.util.Collections;
import java.util.List;

public class DadJokeService {
    private DadJokeRepository repository;
    public DadJokeService(DadJokeRepository repository) {
        this.repository = repository;
    }

    public List<DadJoke> getAll() {
        List<DadJoke> jokes = repository.findAll();
        return Collections.unmodifiableList(jokes);
    }

    public void add(DadJoke joke) {
        repository.save(joke);
    }

    public void update(int id, String newJokeText) {
        DadJoke currentJoke = repository.findById(id).orElseThrow();

        currentJoke.setJokeText(newJokeText);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
