package oo;

public class Value {
    private final int value;

    public Value(int value) {
        if (value < 0 || 1 < value)
            throw new IllegalArgumentException
                ("’l(=" + value + ")‚ÍA0‚©1‚Å‚È‚¯‚ê‚Î‚È‚è‚Ü‚¹‚ñB");
        this.value = value;
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
