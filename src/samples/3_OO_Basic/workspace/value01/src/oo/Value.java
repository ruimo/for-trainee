package oo;

public class Value {
    private final int value;

    public void set(int value) {
        if (value < 0 || 1 < value) throw new IllegalArgumentException
            ("値(=" + value + ")は1か0でなければなりません。");

        this.value = value;
    }

    public int get() {
        return value;
    }
}
