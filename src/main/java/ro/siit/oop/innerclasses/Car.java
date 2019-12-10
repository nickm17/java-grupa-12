package ro.siit.oop.innerclasses;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
//@EqualsAndHashCode
//@RequiredArgsConstructor
@ToString
public class Car {
    private int speed ;
    private int speed2 ;
    private int speed4 ;
    private int speed3 ;
    private int speed5 ;

    static class Dacia {
//        int i = speed;
    }

     class Trabant {
        int i = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed &&
                speed2 == car.speed2 &&
                speed4 == car.speed4 &&
                speed3 == car.speed3 &&
                speed5 == car.speed5;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, speed2, speed4, speed3, speed5);
    }
}


