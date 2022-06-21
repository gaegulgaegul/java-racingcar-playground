package racingcar.domain;

public class Car {
    public static final String COLON_WITH_SPACE = " : ";

    private final Name name;
    private Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void forward(int random) {
        this.position.move(random);
    }

    @Override
    public String toString() {
        return this.name + COLON_WITH_SPACE + this.position;
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isWinner(Position maxPosition) {
        return this.position.equals(maxPosition);
    }
}
