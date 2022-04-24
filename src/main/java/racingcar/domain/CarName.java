package racingcar.domain;

import java.util.Objects;

public class CarName {
    private static final int MAX_CAR_NAME_LENGTH = 5;
    private final String carName;

    public CarName(String carName) {
        validateName(carName);
        this.carName = carName;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("자동차의 이름이 존재 해야 합니다.");
        }
        if (name.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("자동자의 이름은 5글자 넘으면 안됩 니다.");
        }
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
