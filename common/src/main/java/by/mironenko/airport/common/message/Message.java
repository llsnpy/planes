package by.mironenko.airport.common.message;

import by.mironenko.airport.common.bean.Source;
import by.mironenko.airport.common.bean.Type;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Message {

    protected Type type;
    protected Source source;

    public String getCode() {
        return source.name() + "_" + type.name();
    }

}
