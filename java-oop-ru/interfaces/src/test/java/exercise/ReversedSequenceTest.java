package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ReversedSequenceTest {
    @Test
    public void testToString() {
        String text = "abcdef";
        String expected = "fedcba";
        String result = new ReversedSequence(text).toString();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testChatAt() {
        String text = "abcdef";
        char expected = 'e';
        char result = new ReversedSequence(text).charAt(1);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testLength() {
        String text = "abcdef";
        int expected = 6;
        int result = new ReversedSequence(text).length();
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testSubSequence() {
        String text = "abcdef";
        String expected = "edc";
        String result = new ReversedSequence(text).subSequence(1, 4).toString();
        assertThat(result).isEqualTo(expected);
    }

}
