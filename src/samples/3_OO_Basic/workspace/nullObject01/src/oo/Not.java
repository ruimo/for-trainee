package oo;

public class Not {
    private Value value = Value.UNKNOWN;

    public void setInput(int index, Value value) {
        if (value == null) throw new NullPointerException();
        this.value = value;
    }

    public Value getOutput(int index) {
        // TODO: Value.UNKNOWNÇ…ëŒâûÇµÇƒÇ≠ÇæÇ≥Ç¢ÅB

        if (value.equals(Value.ZERO)) return Value.ONE;
        else if (value.equals(Value.ONE)) return Value.ZERO;
        else return Value.UNKNOWN;
    }
}
