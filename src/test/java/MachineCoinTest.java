import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MachineCoinTest {
    @Test
    public void piece_2() {
        Change changedMoney = change(2);

        assertThat(changedMoney).isEqualTo(expectedChange(1, 0, 0));
    }

    private Change expectedChange(int piece2, int billet5, int billet10) {
        return new Change(piece2, billet5, billet10);
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

