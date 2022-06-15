package racingcar.domain;

import java.util.Objects;
import java.util.stream.IntStream;

public class Car {
    private final String name;
    private int position;

    public Car(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 초과로 입력할 수 없습니다. " + name);
        }

        this.name = name;
        this.position = 0;
    }

    public void forward(int random) {
        if (random >= 4) {
            this.position++;
        }
    }

    @Override
    public String toString() {
        return this.name + " : " + getPositionView();
    }

    private String getPositionView() {
        return IntStream.rangeClosed(1, this.position)
                .mapToObj(i -> "-")
                .reduce("", (acc, next) -> acc += next);
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public boolean isWinner(int maxPosition) {
        return this.position == maxPosition;
    }
}
