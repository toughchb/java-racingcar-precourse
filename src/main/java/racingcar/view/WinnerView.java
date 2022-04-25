package racingcar.view;

import java.text.MessageFormat;
import java.util.List;
import java.util.ResourceBundle;
import java.util.StringJoiner;
import racingcar.domain.dto.CarDto;
import racingcar.domain.dto.CarsDto;

public class WinnerView {

    static ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

    static private final String JOIN_DELIM = ",";

    public static void printWinners(CarsDto carsDto) {
        List<CarDto> cars = carsDto.getCars();
        StringJoiner joiner = new StringJoiner(JOIN_DELIM);
        for (CarDto car : cars) {
            joiner.add(car.getCarName());
        }

        String string = resourceBundle.getString("game.winner");
        System.out.println(MessageFormat.format(string, joiner.toString()));
    }
}
