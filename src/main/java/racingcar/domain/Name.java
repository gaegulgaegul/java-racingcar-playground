package racingcar.domain;

import java.util.Objects;

public class Name {
    public static final int MAX_LENGTH = 5;

    private final String name;

    public Name(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 초과로 입력할 수 없습니다. " + name);
        }

        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
