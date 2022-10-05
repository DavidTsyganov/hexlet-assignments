package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;


class AppTest {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

    @Test
    void testIfNLessThanSize() {
        assertThat(List.of(1, 2, 3, 4)).isEqualTo(App.take(list, 4));
    }
    @Test
    void testIfNIsEqualToSize() {
        assertThat(List.of(1, 2, 3, 4, 5, 6)).isEqualTo(App.take(list, 6));
    }

    @Test
    void testIfNIsMoreThanSize() {
        assertThat(List.of(1, 2, 3, 4, 5, 6)).isEqualTo(App.take(list, 8));
    }
    @Test
    void testIfNIsZero() {
        assertThat(List.of()).isEqualTo(App.take(list, 0));
    }

    @Test
    void testIfNIsLessThanZero() {
        assertThat(List.of()).isEqualTo(App.take(list, -1));
    }

}
