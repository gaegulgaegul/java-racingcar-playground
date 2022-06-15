package racingcar.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    public static final String COMMA = ",";
    private final List<Car> cars;

    public Cars(String text) {
        this.cars = new ArrayList<>();
        for (String name : text.split(COMMA)) {
            cars.add(new Car(name));
        }
    }

    public int size() {
        return cars.size();
    }

    public void forward(int[] randoms) {
        for (int i = 0; i < randoms.length; i++) {
            cars.get(i).forward(randoms[i]);
        }
    }

    public List<String> getPositionViews() {
        return cars.stream()
                .map(Car::toString)
                .collect(Collectors.toList());
    }


    public Winners getWinners() {
        int maxPosition = maxPosition();
        List<Car> winners = cars.stream()
                .filter(car -> car.isWinner(maxPosition))
                .collect(Collectors.toList());
        return new Winners(winners);
    }

    public int maxPosition() {
        return cars.stream()
                .map(Car::getPosition)
                .max(Comparator.naturalOrder())
                .orElse(0);
    }
}
