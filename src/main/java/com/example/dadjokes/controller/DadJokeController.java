package com.example.dadjokes.controller;

import com.example.dadjokes.service.DadJokeService;

public class DadJokeController {
    private DadJokeService service;

    public DadJokeController(DadJokeService service) {
        this.service = service;
    }
}
