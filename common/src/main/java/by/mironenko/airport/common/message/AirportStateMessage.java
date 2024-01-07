package by.mironenko.airport.common.message;

import by.mironenko.airport.common.bean.Airport;
import by.mironenko.airport.common.bean.Source;
import by.mironenko.airport.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

//todo add fabric to messages
@Getter
@Setter
public class AirportStateMessage extends Message {

    private Airport airport;

    public AirportStateMessage() {
        this.source = Source.AIRPORT;
        this.type = Type.STATE;
    }

    public AirportStateMessage(final Airport airport) {
        this();
        this.airport = airport;
    }

}
