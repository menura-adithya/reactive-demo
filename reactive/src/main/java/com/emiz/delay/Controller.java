package com.emiz.delay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class Controller {

    @Autowired
    private CustomService customService;

    @GetMapping(value = "/data")
    public Mono<Data> getDataReactive(){
        return customService.getDataReactive(
                Thread.currentThread().getId(),
                System.currentTimeMillis());
    }
}
