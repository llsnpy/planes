package by.mironenko.airport.common.message;

import by.mironenko.airport.common.bean.Board;
import by.mironenko.airport.common.bean.Source;
import by.mironenko.airport.common.bean.Type;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardStateMessage extends Message {

    private Board board;

    public BoardStateMessage() {
        this.source = Source.BOARD;
        this.type = Type.STATE;
    }

    public BoardStateMessage(final Board board) {
        this();
        this.board = board;
    }

}
