import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MachineCoinTest {
    @Test
    public void piece_2_for_value_2() {
        int piece2 = change2(2);

        assertThat(piece2).isEqualTo(1);
    }

    @Test
    public void piece_2_for_value_7() {
        int piece2 = change2(2);

        assertThat(piece2).isEqualTo(1);
    }

    @Test
    public void piece_2_for_value_12() {
        int piece2 = change2(2);

        assertThat(piece2).isEqualTo(1);
    }

    @Test
    public void two_pieces_2_for_value_4() {
        int piece2 = change2(4);

        assertThat(piece2).isEqualTo(2);
    }

    @Test
    public void two_pieces_2_for_value_9() {
        int piece2 = change2(9);

        assertThat(piece2).isEqualTo(2);
    }

    @Test
    public void two_pieces_2_for_value_14() {
        int piece2 = change2(14);

        assertThat(piece2).isEqualTo(2);
    }

    @Test
    public void two_pieces_2_for_value_19() {
        int piece2 = change2(19);

        assertThat(piece2).isEqualTo(2);
    }

    @Test
    public void two_pieces_3_for_value_6() {
        int piece2 = change2(6);

        assertThat(piece2).isEqualTo(3);
    }

    @Test
    public void two_pieces_3_for_value_11() {
        int piece2 = change2(11);

        assertThat(piece2).isEqualTo(3);
    }

    @Test
    public void two_pieces_3_for_value_16() {
        int piece2 = change2(11);

        assertThat(piece2).isEqualTo(3);
    }

    @Test
    public void two_pieces_3_for_value_21() {
        int piece2 = change2(11);

        assertThat(piece2).isEqualTo(3);
    }

    @Test
    public void two_pieces_4_for_value_8() {
        int piece2 = change2(8);

        assertThat(piece2).isEqualTo(4);
    }

    private int change2(int value) {
        int lastDigit = value % 10;
        if (lastDigit == 4 || lastDigit == 9) return 2;
        if (lastDigit == 6 || lastDigit == 1) return 3;
        if (value == 8) return 4;
        return 1;
    }
}

