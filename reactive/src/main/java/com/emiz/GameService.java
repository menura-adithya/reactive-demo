package com.emiz;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@AllArgsConstructor
@Service
public class GameService {
    private final GameRepository gameRepository;

    public Flux<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Flux<Game> getAllGamesAsStream() {
        return gameRepository.findAll().delayElements(Duration.ofSeconds(1));
    }

    public Mono<Game> getGameById(Long id) {
        return gameRepository.findById(id)
                .delayElement(Duration.ofSeconds(1));
    }
}
