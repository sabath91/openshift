package pl.czyz.dockertime.Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
    private final long id;
    private final String message;
    private final LocalDateTime time;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public Time(long id) {
        this.id = id;
        this.message = "Hello Adam";
        this.time = LocalDateTime.now();
    }

//    public long getId() {
//        return id;
//    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time.format(formatter);
    }
}
