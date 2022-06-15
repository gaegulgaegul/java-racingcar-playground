package racingcar.utils;

public class RandomUtils {

    public static int[] numbers(int numberOfCar) {
        int[] numbers = new int[numberOfCar];
        for (int i = 0; i < numberOfCar; i++) {
            numbers[i] = (int) (Math.random() * 9) + 1;
        }
        return numbers;
    }
}
