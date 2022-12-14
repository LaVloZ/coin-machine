import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MachineCoinTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "5, 0",
            "10, 0",
            "15, 0",
            "2, 1",
            "7, 1",
            "12, 1",
            "17, 1",
            "4, 2",
            "9, 2",
            "14, 2",
            "19, 2",
            "6, 3",
            "11, 3",
            "16, 3",
            "21, 3",
            "8, 4",
            "13, 4",
            "18, 4",
            "23, 4",
    })
    void piece_2(int value, int expected) {
        int pieces2 = change2(value);

        assertThat(pieces2).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "2, 0",
            "4, 0",
            "6, 0",
            "8, 0",
            "10, 0",
            "12, 0",
            "14, 0",
            "16, 0",
            "18, 0",
            "20, 0",
            "5, 1",
            "15, 1",
            "25, 1",
            "7, 1",
            "17, 1",
            "27, 1",
            "9, 1",
            "19, 1",
            "29, 1",
            "11, 1",
            "21, 1",
            "31, 1",
            "13, 1",
            "23, 1",
            "33, 1",
    })
    void billet_5(int value, int expected) {
        int billet5 = change5(value);

        assertThat(billet5).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "2, 0",
            "4, 0",
            "5, 0",
            "6, 0",
            "7, 0",
            "8, 0",
            "9, 0",
            "11, 0",
            "13, 0",
            "10, 1",
            "12, 1",
            "14, 1",
            "15, 1",
            "16, 1",
            "17, 1",
            "18, 1",
            "19, 1",
            "21, 1",
            "23, 1",
            "20, 2",
            "22, 2",
            "24, 2",
            "25, 2",
            "26, 2",
            "27, 2",
            "28, 2",
            "29, 2",
            "31, 2",
            "33, 2",
    })
    void billet_10(int value, int expected) {
        int billet10 = change10(value);

        assertThat(billet10).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "-1, false",
            "1, false",
            "3, false",
            "0, true",
            "2, true",
            "11, true",
            "133, true",
    })
    void unhandled_values(int value, boolean expected) {
        boolean changePossible = changePossible(value);
        assertThat(changePossible).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0, 0",
            "33, 4, 1, 2",
            "40, 0, 0, 4",
            "28, 4, 0, 2",
    })
    void change_value(int value, int expectedPiece2, int expectedBillet5, int expectedBillet10) {
        Change change = change(value);

        assertThat(change.piece2).isEqualTo(expectedPiece2);
        assertThat(change.billet5).isEqualTo(expectedBillet5);
        assertThat(change.billet10).isEqualTo(expectedBillet10);
    }

    @ParameterizedTest
    @CsvSource({
            "-100",
            "-50",
            "-4",
            "-3",
            "-1",
            "1",
            "3",
    })
    void change_unhandled_value(int value) {
        Change change = change(value);

        assertThat(change).isNull();
    }

    private Change change(int value) {
        if (changePossible(value)) {
            return new Change(change2(value), change5(value), change10(value));
        }
        return null;
    }

    private boolean changePossible(int value) {
        return value >= 0 && value != 1 && value != 3;
    }

    private int change10(int value) {
        int lastDigit = value % 10;
        if (value >= 10) {
            if (lastDigit == 0) return value / 10;
            if (lastDigit == 2) return value / 10;
            if (lastDigit == 4) return value / 10;
            if (lastDigit == 5) return value / 10;
            if (lastDigit == 6) return value / 10;
            if (lastDigit == 7) return value / 10;
            if (lastDigit == 8) return value / 10;
            if (lastDigit == 9) return value / 10;
            return value / 10 - 1;
        }
        return 0;
    }

    private int change5(int value) {
        int lastDigit = value % 10;
        if (lastDigit == 1) return 1;
        if (lastDigit == 3) return 1;
        if (lastDigit == 5) return 1;
        if (lastDigit == 7) return 1;
        if (lastDigit == 9) return 1;
        return 0;
    }

    private int change2(int value) {
        int lastDigit = value % 10;
        if (lastDigit == 4) return 2;
        if (lastDigit == 9) return 2;
        if (lastDigit == 6) return 3;
        if (lastDigit == 1) return 3;
        if (lastDigit == 8) return 4;
        if (lastDigit == 3) return 4;
        if (lastDigit == 0) return 0;
        if (lastDigit == 5) return 0;
        return 1;
    }

    public record Change(int piece2,
                         int billet5,
                         int billet10
    ) {
    }
}

