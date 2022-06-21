package racingcar.domain;

import java.util.Objects;
import java.util.stream.IntStream;

public class Position implements Comparable<Position> {
    public static final int FORWARD_STANDARD_VALUE = 4;
    public static final String DASH = "-";
    public static final String EMPTY = "";

    private int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        this.position = position;
    }

    public void move(int random) {
        if (random >= FORWARD_STANDARD_VALUE) {
            this.position += 1;
        }
    }

    @Override
    public String toString() {
        return IntStream.rangeClosed(1, this.position)
                .mapToObj(i -> DASH)
                .reduce(EMPTY, (acc, next) -> acc += next);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public int compareTo(Position position) {
        return this.position - position.position;
    }
}
