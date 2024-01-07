package by.mironenko.airport.common.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoutePoint {

    private String pointName;
    private double x;
    private double y;

}
