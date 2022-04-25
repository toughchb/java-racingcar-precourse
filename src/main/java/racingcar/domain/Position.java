package racingcar.domain;

import java.util.Objects;
import java.util.ResourceBundle;

public class Position {
    public static final int MIN_NUMBER = 0;
    private int position;

    public Position() {
        this(MIN_NUMBER);
    }

    public Position(int position) {
        if (position < MIN_NUMBER) {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
            throw new IllegalArgumentException(resourceBundle.getString("error.try-time.positive"));
        }
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public Position movePosition() {
        return new Position(this.position += 1);
    }

    public boolean biggerThan(Position maxPosition) {
        return this.position > maxPosition.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

}
