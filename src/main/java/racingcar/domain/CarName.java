package racingcar.domain;

import java.util.Objects;
import java.util.ResourceBundle;

public class CarName {
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private final String carName;

    public CarName(String carName) {
        validateName(carName);
        this.carName = carName;
    }

    private void validateName(String name) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException(resourceBundle.getString("error.car-name.need"));
        }
        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException(resourceBundle.getString("error.car-name.length"));
        }
    }

    public String getCarName() {
        return carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CarName carName1 = (CarName) o;
        return Objects.equals(carName, carName1.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
