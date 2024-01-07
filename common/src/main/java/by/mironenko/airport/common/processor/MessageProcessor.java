package by.mironenko.airport.common.processor;

import by.mironenko.airport.common.message.Message;

public interface MessageProcessor<T extends Message> {

    void process(String jsonMessage);

}
