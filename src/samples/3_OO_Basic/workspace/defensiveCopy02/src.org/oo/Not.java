package oo;

public class Not {
    private Value value;

    public void setInput(int index, Value value) {
    	// TODO: テストが通るように修正してください。
        this.value = value;
    }

    public Value getOutput(int index) {
        Value ret = new Value();

        if (value.get() == 0) ret.set(1);
        else ret.set(0);

        return ret;
    }
}
