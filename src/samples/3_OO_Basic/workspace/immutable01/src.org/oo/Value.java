package oo;

public class Value {
    private final int value;

    public Value(int value) {
        // TODO: valueの値をチェックして、問題があればIllegalArgumentExceptionをスローしてください。
        // 問題なければ、フィールドのvalueに設定してください。
    }

    public int get() {
        return value;
    }

    @Override public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (o.getClass() != getClass()) return false;
        Value that = (Value)o;
        return that.value == value;
    }

    @Override public int hashCode() {
        return value;
    }
}
