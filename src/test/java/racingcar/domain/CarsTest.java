package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    void maxPosition_구하기() {
        Car car1 = new Car("car1", 1);
        Car car2 = new Car("car2", 3);
        Car car3 = new Car("car3", 5);
        Cars cars = new Cars(Arrays.asList(car1, car2, car3));

        Position maxPosition = cars.findMaxPosition();
        assertThat(maxPosition).isEqualTo(new Position(5));
    }

    @Test
    void maxPosition을_가진_Winners_구하기() {
        Car car1 = new Car("car1", 1);
        Car car2 = new Car("car2", 5);
        Car car3 = new Car("car3", 5);
        Cars cars = new Cars(Arrays.asList(car1, car2, car3));
        Position maxPosition = cars.findMaxPosition();
        List<Car> winners = cars.findWinners(maxPosition);
        assertThat(winners).containsExactly(car2, car3);
    }
}
