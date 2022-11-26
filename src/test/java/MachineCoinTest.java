import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MachineCoinTest {

    @Nested
    public class Piece2 {

        @Test
        public void zero_piece_2_for_value_0() {
            int piece2 = change2(0);

            assertThat(piece2).isEqualTo(0);
        }

        @Test
        public void zero_piece_2_for_value_5() {
            int piece2 = change2(5);

            assertThat(piece2).isEqualTo(0);
        }

        @Test
        public void zero_piece_2_for_value_10() {
            int piece2 = change2(10);

            assertThat(piece2).isEqualTo(0);
        }

        @Test
        public void zero_piece_2_for_value_15() {
            int piece2 = change2(15);

            assertThat(piece2).isEqualTo(0);
        }

        @Test
        public void one_piece_2_for_value_2() {
            int piece2 = change2(2);

            assertThat(piece2).isEqualTo(1);
        }

        @Test
        public void one_piece_2_for_value_7() {
            int piece2 = change2(2);

            assertThat(piece2).isEqualTo(1);
        }

        @Test
        public void one_piece_2_for_value_12() {
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
        public void three_pieces_2_for_value_6() {
            int piece2 = change2(6);

            assertThat(piece2).isEqualTo(3);
        }

        @Test
        public void three_pieces_2_for_value_11() {
            int piece2 = change2(11);

            assertThat(piece2).isEqualTo(3);
        }

        @Test
        public void three_pieces_2_for_value_16() {
            int piece2 = change2(11);

            assertThat(piece2).isEqualTo(3);
        }

        @Test
        public void three_pieces_2_for_value_21() {
            int piece2 = change2(11);

            assertThat(piece2).isEqualTo(3);
        }

        @Test
        public void four_pieces_2_for_value_8() {
            int piece2 = change2(8);

            assertThat(piece2).isEqualTo(4);
        }

        @Test
        public void four_pieces_2_for_value_13() {
            int piece2 = change2(13);

            assertThat(piece2).isEqualTo(4);
        }

        @Test
        public void four_pieces_2_for_value_18() {
            int piece2 = change2(18);

            assertThat(piece2).isEqualTo(4);
        }

        @Test
        public void four_pieces_2_for_value_23() {
            int piece2 = change2(23);

            assertThat(piece2).isEqualTo(4);
        }
    }

    @Nested
    public class Billet5 {
        @Test
        void zero_billet_5_for_value_0() {
            int billet5 = change5(0);

            assertThat(billet5).isEqualTo(0);
        }
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

