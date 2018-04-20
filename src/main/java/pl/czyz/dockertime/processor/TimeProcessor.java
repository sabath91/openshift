package pl.czyz.dockertime.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import pl.czyz.dockertime.Model.Time;

import java.time.LocalDateTime;

public class TimeProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Time timeMessage = exchange.getIn().getBody(Time.class);
        timeMessage.setTime(LocalDateTime.now());
        exchange.getIn().setBody(timeMessage);
    }
}
