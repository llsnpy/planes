package by.mironenko.airport.common.message;

import by.mironenko.airport.common.bean.Source;
import by.mironenko.airport.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OfficeStateMessage extends Message {

    public OfficeStateMessage() {
        this.source = Source.OFFICE;
        this.type = Type.STATE;
    }

}
