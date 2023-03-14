package org.emiz.delay;

import org.emiz.delay.Data;
import org.springframework.stereotype.Service;

@Service
public class CustomService {
    public Data getDataStandard(long threadId, long time) {
        try {
            Thread.sleep(5000);
            return Data.builder().data("Some Data").threadId(threadId).requestCameTime(time).build();
        } catch (InterruptedException e) {
            throw new RuntimeException("error happened");
        }
    }
}
