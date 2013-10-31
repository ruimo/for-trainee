package oo;

public enum Value {
    UNKNOWN {
        @Override public Value not() {
            return Value.UNKNOWN;
        }

        @Override public Value and(Value that) {
            if (that == null) throw new NullPointerException();
            if (that == Value.ZERO) return Value.ZERO; // ZERO�Ƃ�AND���Z�͏��ZERO
            else return Value.UNKNOWN;
        }

        @Override public Value or(Value that) {
            if (that == null) throw new NullPointerException();
            // TODO: �������Ă��������B
        }
    },
    ZERO {
        @Override public Value not() {
            return Value.ONE;
        }

        @Override public Value and(Value that) {
            if (that == null) throw new NullPointerException();
            return Value.ZERO; // ZERO�Ƃ�AND���Z�͏��ZERO
        }

        @Override public Value or(Value that) {
            if (that == null) throw new NullPointerException();
            // TODO: �������Ă��������B
        }
    },
    ONE {
        @Override public Value not() {
            return Value.ZERO;
        }

        @Override public Value and(Value that) {
            if (that == null) throw new NullPointerException();
            return that;
        }

        @Override public Value or(Value that) {
            if (that == null) throw new NullPointerException();
            // TODO: �������Ă��������B
        }
    };

    abstract public Value not();
    abstract public Value and(Value that);
    abstract public Value or(Value that);
}
