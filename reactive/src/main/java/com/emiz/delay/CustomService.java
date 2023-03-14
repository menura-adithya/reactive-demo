package com.emiz.delay;

import com.emiz.delay.Data;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class CustomService {
    public Mono<Data> getDataReactive(long threadId, long time){
        return Mono.just(Data.builder()
                .data("Some Data")
                .threadId(threadId)
                .requestCameTime(time)
                .build())
                .delayElement(Duration.ofSeconds(5));
    }
}
