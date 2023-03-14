package org.emiz;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GameService {
    private final GameRepository gameRepository;

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGameById(Long id) {
        try {
            Thread.sleep(1000);
            return gameRepository.findById(id).get();
        } catch (InterruptedException e) {
            throw new RuntimeException("error happened");
        }
    }
}
