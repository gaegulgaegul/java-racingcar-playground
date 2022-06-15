package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.utils.RandomUtils;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class RacingCar {

    public void start() {
        String names = InputView.names();
        Cars cars = new Cars(names);

        int numberOfRound = InputView.numberOfRound();

        ResultView.comment();
        for (int i = 0; i < numberOfRound; i++) {
            cars.forward(RandomUtils.numbers(cars.size()));
            ResultView.printPositions(cars.getPositionViews());
        }
        ResultView.printWinners(cars.getWinners());
    }
}
