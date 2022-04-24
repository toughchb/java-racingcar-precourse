package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {
    private final List<Car> participants;

    public Cars(List<Car> cars) {
        participants = cars;
    }

    public Position findMaxPosition() {
        Position maxPosition = new Position();
        for (Car participant : participants) {
            maxPosition = participant.getMaxPosition(maxPosition);
        }
        return maxPosition;
    }

    public List<Car> findWinners(Position maxPosition) {
        List<Car> winners = new ArrayList<>();
        for (Car participant : participants) {
            makeWinnerList(maxPosition, winners, participant);
        }
        return winners;
    }

    private void makeWinnerList(Position maxPosition, List<Car> winners, Car participant) {
        if (participant.isWinner(maxPosition)) {
            winners.add(participant);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cars cars = (Cars) o;
        return Objects.equals(participants, cars.participants);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participants);
    }

}
