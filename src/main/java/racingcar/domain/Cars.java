package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    public static final String COMMA = ",";
    private final List<Car> carList;

    public Cars(String text) {
        this.carList = new ArrayList<>();
        for (String name : text.split(COMMA)) {
            carList.add(new Car(name));
        }
    }

    public int size() {
        return carList.size();
    }

    public void forward(int[] randoms) {
        for (int i = 0; i < randoms.length; i++) {
            carList.get(i).forward(randoms[i]);
        }
    }

    public List<String> getPositionViews() {
        return carList.stream()
                .map(Car::toString)
                .collect(Collectors.toList());
    }



}
