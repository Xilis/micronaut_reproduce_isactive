package com.example.banana;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;
import java.util.Optional;

@Controller("/banana")
public class BananaController {

    protected final BananaRepository bananaRepository;

    public BananaController(BananaRepository bananaRepository) {
        this.bananaRepository = bananaRepository;
    }

    @Get()
    public List<Banana> list() {
        return (List<Banana>) bananaRepository.findAll();
    }

    @Get("{id}")
    public Optional<Banana> get(Long id) {
        return bananaRepository.findById(id);

    }
}
