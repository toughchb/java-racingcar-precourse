package racingcar.util;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InputValidatorTest {

    @Test
    void 자동차_이름_입력시_구분자_검증() {
        String input = ",,";
        assertThatThrownBy(
                () -> InputValidator.validateCarNamesString(input)
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차의 이름 입력 형태 오류 (이름은 쉼표(,) 기준으로 빈값 불가)");
    }

    @Test
    void 시도회수_정수인지_검증() {
        String input = "asbc";
        assertThatThrownBy(
                () -> InputValidator.validateTryTimeIsInteger(input)
        ).isInstanceOf(IllegalArgumentException.class)
                .hasMessage("시도 횟수는 숫자여야 합니다.");
    }
}