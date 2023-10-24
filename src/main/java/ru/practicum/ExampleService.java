package ru.practicum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleService {
    private final static Logger log = LoggerFactory.getLogger(ExampleService.class);

    public int sum(int a, int b) {
        log.info("Got a={}, b={}", a, b);
        return a + b;
    }
}
