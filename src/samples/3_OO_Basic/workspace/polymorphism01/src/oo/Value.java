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
            // TODO: é¿ëïÇµÇƒÇ≠ÇæÇ≥Ç¢ÅB
            return Value.???;
        }
    };

    abstract public Value not();
}
