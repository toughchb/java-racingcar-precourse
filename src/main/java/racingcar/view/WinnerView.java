package racingcar.view;

import java.util.List;
import java.util.StringJoiner;
import racingcar.domain.dto.CarDto;
import racingcar.domain.dto.CarsDto;

public class WinnerView {

    static private final String JOIN_DELIM = ",";
    static private final String GAME_SINNER_MESSAGE = "최종 우승자: ";

    public static void printWinners(CarsDto carsDto) {
        List<CarDto> cars = carsDto.getCars();
        StringJoiner joiner = new StringJoiner(JOIN_DELIM);
        for (CarDto car : cars) {
            joiner.add(car.getCarName());
        }

        System.out.println(GAME_SINNER_MESSAGE + joiner.toString());
    }
}
