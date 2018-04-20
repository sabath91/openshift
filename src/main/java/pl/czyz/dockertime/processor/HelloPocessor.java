package pl.czyz.dockertime.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import pl.czyz.dockertime.Model.Time;


public class HelloPocessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        Time timeMessage = exchange.getIn().getBody(Time.class);
        timeMessage.setMessage("Hello for MessageProcessor");
        exchange.getIn().setBody(timeMessage);
    }
}
