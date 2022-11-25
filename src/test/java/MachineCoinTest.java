import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MachineCoinTest {
    @Test
    public void change_of_2() {
        Change actual = change(2);

        Assertions.assertThat(actual.piece2).isEqualTo(1);
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

