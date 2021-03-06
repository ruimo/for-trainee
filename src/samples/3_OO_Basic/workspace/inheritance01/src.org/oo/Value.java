package oo;

public enum Value {
    UNKNOWN {
        @Override public Value not() {
            return Value.UNKNOWN;
        }

        @Override public Value and(Value that) {
            if (that == null) throw new NullPointerException();
            if (that == Value.ZERO) return Value.ZERO; // ZEROとのAND演算は常にZERO
            else return Value.UNKNOWN;
        }

        @Override public Value or(Value that) {
            if (that == null) throw new NullPointerException();
            // TODO: 実装してください。
        }
    },
    ZERO {
        @Override public Value not() {
            return Value.ONE;
        }

        @Override public Value and(Value that) {
            if (that == null) throw new NullPointerException();
            return Value.ZERO; // ZEROとのAND演算は常にZERO
        }

        @Override public Value or(Value that) {
            if (that == null) throw new NullPointerException();
            // TODO: 実装してください。
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
            // TODO: 実装してください。
        }
    };

    abstract public Value not();
    abstract public Value and(Value that);
    abstract public Value or(Value that);
}
