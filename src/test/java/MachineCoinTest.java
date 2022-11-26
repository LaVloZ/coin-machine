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

    private int change2(int value) {
        return 1;
    }

    public record Change(
            int piece2,
            int billet5,
            int billet10
    ) {
    }
}

