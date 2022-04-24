package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 숫자가_3이하_이면_멈춘다() {
        Car car = new Car(new CarName("car"), new Position(0));
        car.move(3);
        assertThat(car).isEqualTo(new Car(new CarName("car"), new Position(0)));
    }

    @Test
    void 숫자가_4이상_이면_움직인다() {
        Car car = new Car(new CarName("car"), new Position(0));
        car.move(4);
        assertThat(car).isEqualTo(new Car(new CarName("car"), new Position(1)));
    }
}
