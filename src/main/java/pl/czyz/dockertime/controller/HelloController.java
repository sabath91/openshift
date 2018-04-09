package pl.czyz.dockertime.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.czyz.dockertime.Model.Time;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public Time time() {
        return new Time(counter.incrementAndGet());
    }
}

