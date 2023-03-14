package org.emiz.delay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private CustomService customService;

    @GetMapping(value = "/data")
    public Data getDataStandard() {
        return customService.getDataStandard(
                Thread.currentThread().getId(),
                System.currentTimeMillis());
    }
}
