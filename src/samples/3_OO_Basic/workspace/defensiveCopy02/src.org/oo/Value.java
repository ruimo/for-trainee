package oo;

public class Value {
    private int value;

    public void set(int value) {
        if (value < 0 || 1 < value)
            throw new IllegalArgumentException
                ("�l(=" + value + ")�́A0��1�łȂ���΂Ȃ�܂���B");

        this.value = value;
    }

    public int get() {
        return value;
    }
}
