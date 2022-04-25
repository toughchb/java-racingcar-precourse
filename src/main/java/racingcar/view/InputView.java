package racingcar.view;

import java.util.ResourceBundle;

public class InputView {
    static ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

    static public void printCarNamesInputMessage() {
        System.out.println(resourceBundle.getString("input.cars"));
    }

    static public void printTryTimesInputMessage() {
        System.out.println(resourceBundle.getString("input.try-times"));
    }
}
