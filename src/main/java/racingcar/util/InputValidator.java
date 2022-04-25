package racingcar.util;

import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class InputValidator {
    static ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

    public static void validateCarNamesString(String input) {
        List<String> inputCars = Arrays.asList(input.split(","));
        if (inputCars.isEmpty()) {
            throw new IllegalArgumentException(resourceBundle.getString("error.car-name.format"));
        }
    }

    public static void validateTryTimeIsInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(resourceBundle.getString("error.try-time.type"));
        }
    }
}
