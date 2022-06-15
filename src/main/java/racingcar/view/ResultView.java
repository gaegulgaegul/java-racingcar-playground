package racingcar.view;

import racingcar.domain.Winners;

import java.util.List;

public class ResultView {

    public static void comment() {
        System.out.println("\n실행 결과");
    }

    public static void printPositions(List<String> positionView) {
        positionView.forEach(System.out::println);
        System.out.println();
    }

    public static void printWinners(Winners winners) {
        System.out.println(winners + "가 최종 우승했습니다.");
    }
}
