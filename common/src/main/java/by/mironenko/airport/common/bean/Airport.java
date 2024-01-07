package by.mironenko.airport.common.bean;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
public class Airport {

    private String name;
    private List<String> boards = new ArrayList<>();
    private int x;
    private int y;

    private void addBoard(final String boardName) {
        int index = boards.indexOf(boardName);
        if (index >= 0) {
            boards.set(index, boardName);
        } else {
            boards.add(boardName);
        }
    }

    private void removeBoard(final String boardName) {
        boards.remove(boardName);
    }

}
