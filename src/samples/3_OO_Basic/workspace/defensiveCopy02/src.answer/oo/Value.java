package oo;

public class Value {
    private int value;

    public void set(int value) {
        if (value < 0 || 1 < value)
            throw new IllegalArgumentException
                ("’l(=" + value + ")‚ÍA0‚©1‚Å‚È‚¯‚ê‚Î‚È‚è‚Ü‚¹‚ñB");

        this.value = value;
    }

    public int get() {
        return value;
    }
}
