package oo;

public class Value {
    private final int value;

    public Value(int value) {
        if (value < 0 || 1 < value) throw new IllegalArgumentException
            ("�l(=" + value + ")�͕s�K�؂ł��B1��0�łȂ���΂Ȃ�܂���B");
        this.value = value;
        // TODO: value�̒l���`�F�b�N���āA��肪�����IllegalArgumentException���X���[���Ă��������B
        // ���Ȃ���΁A�t�B�[���h��value�ɐݒ肵�Ă��������B
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
