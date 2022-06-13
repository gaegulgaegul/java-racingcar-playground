package addcalculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    private static final String SINGLE_NUMBER_PATTERN = "[0-9]";
    private static final String DEFAULT_PATTERN = ",|:";
    private static final String CUSTOM_PATTERN = "//(.)\\n(.*)";
    private static final String MINUS = "-";

    public int calculate(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        if (text.contains(MINUS)) {
            throw new RuntimeException();
        }

        if (text.matches(SINGLE_NUMBER_PATTERN)) {
            return Integer.parseInt(text);
        }

        if (getMatcher(DEFAULT_PATTERN, text).find()) {
            String[] split = text.split(DEFAULT_PATTERN);
            return summary(split);
        }

        Matcher matcher = getMatcher(CUSTOM_PATTERN, text);
        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            String[] split = matcher.group(2).split(customDelimiter);
            return summary(split);
        }
        return 0;
    }

    private Matcher getMatcher(String pattern, String text) {
        return Pattern.compile(pattern).matcher(text);
    }

    private int summary(String[] split) {
        return Arrays.stream(split).mapToInt(Integer::parseInt).sum();
    }
}
