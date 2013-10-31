package oo;

public class Not {
    private Value value = Value.UNKNOWN;

    public void setInput(int index, Value value) {
        if (value == null) throw new NullPointerException();
        this.value = value;
    }

    public Value getOutput(int index) {
        switch (value) {
        case ZERO: return Value.ONE;
        case ONE: return Value.ZERO;
        default: return Value.UNKNOWN;
        }
    }
}
