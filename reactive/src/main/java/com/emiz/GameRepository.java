package com.emiz;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends R2dbcRepository<Game,Long> {
}
