package oo;

public class Not {
    private Value value;

    public void setInput(int index, Value value) {
        this.value = value;
    }

    public Value getOutput(int index) {
        if (value.get() == 0) return new Value(1);
        else return new Value(0);
    }
}
