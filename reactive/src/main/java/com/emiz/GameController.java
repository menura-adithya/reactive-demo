package com.emiz;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("games")
public class GameController {
    private final GameService gameService;

    @GetMapping(value = "")
    public Flux<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping(value = "/stream", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<Game> getAllGamesAsStream() {
        return gameService.getAllGamesAsStream();
    }

    @GetMapping("/{id}")
    public Mono<Game> getGame(@PathVariable Long id) {
        return gameService.getGameById(id);
    }
}
