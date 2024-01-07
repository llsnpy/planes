package by.mironenko.airport.common.processor;

import by.mironenko.airport.common.message.Message;
import com.google.gson.Gson;

public class MessageConverter {

    private final Gson gson = new Gson();

    public String extractCode(final String data) {
        return gson.fromJson(data, Message.class).getCode();
    }

    public <T extends Message> T extractMessage(final String data, final Class<T> clazz) {
        return gson.fromJson(data, clazz);
    }

    public String toJson(final Object message) {
        return gson.toJson(message);
    }

}
