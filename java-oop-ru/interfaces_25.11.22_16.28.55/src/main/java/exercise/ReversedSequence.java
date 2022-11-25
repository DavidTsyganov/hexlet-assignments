package exercise;

import java.util.Arrays;

public class ReversedSequence implements CharSequence {
    private String text;

    public ReversedSequence(String text) {
        char[] chars = new char[text.length()];
        int j = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            chars[j++] = text.charAt(i);
        }
        this.text = String.valueOf(chars);
    }

    @Override
    public int length() {
        return text.toCharArray().length;
    }

    @Override
    public char charAt(int i) {
        return text.charAt(i);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return text.subSequence(i, i1);
    }

    @Override
    public String toString() {
        return text;
    }
}
