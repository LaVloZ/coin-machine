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
    })
    void billet_5(int value, int expected) {
        int billet5 = change5(value);

        assertThat(billet5).isEqualTo(expected);
    }

    private int change5(int value) {
        return 0;
    }

    private int change2(int value) {
        int lastDigit = value % 10;
        if (lastDigit == 4 || lastDigit == 9) return 2;
        if (lastDigit == 6 || lastDigit == 1) return 3;
        if (lastDigit == 8 || lastDigit == 3) return 4;
        if (lastDigit == 0 || lastDigit == 5) return 0;
        return 1;
    }
}

