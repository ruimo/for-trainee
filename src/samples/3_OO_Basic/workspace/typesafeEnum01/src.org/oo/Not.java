package oo;

public class Not {
    private Value value;

    public void setInput(int index, Value value) {
        if (value == null) throw new NullPointerException();
        this.value = value;
    }

    public Value getOutput(int index) {
        // TODO: �^�C�v�Z�[�tenum�ɍ��킹�ďC�����Ă��������B

        if (value.equals(new Value(0))) return new Value(1);
        else return new Value(0);
    }
}
