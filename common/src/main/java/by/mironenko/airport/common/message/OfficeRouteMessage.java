package by.mironenko.airport.common.message;

import by.mironenko.airport.common.bean.Route;
import by.mironenko.airport.common.bean.Source;
import by.mironenko.airport.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficeRouteMessage extends Message {

    private Route route;

    public OfficeRouteMessage() {
        this.source = Source.OFFICE;
        this.type = Type.ROUTE;
    }

    public OfficeRouteMessage(final Route route) {
        this();
        this.route = route;
    }

}
