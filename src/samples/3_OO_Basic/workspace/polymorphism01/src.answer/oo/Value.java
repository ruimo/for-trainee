package oo;

public enum Value {
    UNKNOWN {
        @Override public Value not() {
            return Value.UNKNOWN;
        }
    },
    ZERO {
        @Override public Value not() {
            return Value.ONE;
        }
    },
    ONE {
        @Override public Value not() {
            // TODO: 実装してください。
            return Value.ZERO;
        }
    };

    abstract public Value not();
}
