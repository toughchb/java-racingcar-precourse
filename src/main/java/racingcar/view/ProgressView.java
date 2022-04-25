package racingcar.view;

import java.util.List;
import java.util.ResourceBundle;
import racingcar.domain.dto.CarDto;
import racingcar.domain.dto.CarsDto;

public class ProgressView {
    static ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

    public static void printProgressStart() {
        System.out.println(resourceBundle.getString("game.run.result"));
    }

    public static void printProgress(CarsDto carsDto) {
        List<CarDto> cars = carsDto.getCars();
        for (CarDto car : cars) {
            System.out.println(car.getCarName() + " : " + car.getPositionBarString());
        }
    }
}
