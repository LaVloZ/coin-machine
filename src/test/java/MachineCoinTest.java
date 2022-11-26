import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MachineCoinTest {
    @Test
    public void piece_2_for_value2() {
        Change changedMoney = change(2);

        assertThat(changedMoney.piece2).isEqualTo(1);
    }

    @Test
    public void piece_2_for_value_7() {
        Change changedMoney = change(2);

        assertThat(changedMoney.piece2).isEqualTo(1);
    }

    private Change change(int value) {
        return new Change(1, 0, 0);
    }

    public record Change(
            int piece2,
            int billet5,
            int billet10
    ) {
    }
}

