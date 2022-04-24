package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarNameTest {

    @Test
    void 자동차_이름을_검증한다() {
        assertThatThrownBy(
                () -> new CarName("")
        ).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(
                () -> new CarName(null)
        ).isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(
                () -> new CarName("abcdef")
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void CarName_비교() {
        assertThat(new CarName("chae")).isEqualTo(new CarName("chae"));
    }
}
