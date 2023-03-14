package com.emiz.delay;

import lombok.Builder;

@Builder
@lombok.Data
public class Data {
    private Long threadId;
    private Long requestCameTime;
    private String data;
}
