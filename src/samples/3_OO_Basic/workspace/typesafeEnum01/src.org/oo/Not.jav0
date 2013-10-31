package oo;

public class Not {
    private Value value;

    public void setInput(int index, Value value) {
        if (value == null) throw new NullPointerException();
        this.value = value;
    }

    public Value getOutput(int index) {
        if (value.equals(Value.ZERO)) return Value.ONE;
        else return Value.ZERO;
    }
}
