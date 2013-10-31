package oo;

public class Value {
    private int value;

    public void set(int value) {
// TODO: valueをチェックして不適切な値に対しては、IllegalArgumentExceptionをスローしてください。

        this.value = value;
    }

    public int get() {
        return value;
    }
}
