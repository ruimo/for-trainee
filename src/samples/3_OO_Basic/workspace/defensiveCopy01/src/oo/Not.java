package oo;

public class Not {
    private Value value;

    public void setInput(int index, Value value) {
        this.value = value;
    }

    public Value getOutput(int index) {
        Value ret = new Value();
        if (value.get() == 0) {
            ret.set(1);
        }
        else {
            ret.set(0);
        }
        // TODO: フィールドのvalueの値に応じて、retで返すValueに値を設定してください。

        return ret;
    }
}
