package racingcar.domain;

import java.util.Objects;

public class Car {
    public static final int MOVING_CRITERION = 4;

    private final CarName carName;
    private final Position position;

    public Car(CarName carName, Position position) {
        this.carName = carName;
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(carName, car.carName) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, position);
    }

    public void move(int number) {
        if (number >= MOVING_CRITERION) {
            position.movePosition();
        }
    }

}
