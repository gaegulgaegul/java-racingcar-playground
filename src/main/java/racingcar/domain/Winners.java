package racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Winners {
    public static final String COMMA_WITH_SPACE = ", ";

    private final List<Car> winners;

    public Winners(List<Car> winners) {
        this.winners = winners;
    }

    @Override
    public String toString() {
        return winners.stream()
                .map(car -> car.getName().toString())
                .collect(Collectors.joining(COMMA_WITH_SPACE));
    }
}
