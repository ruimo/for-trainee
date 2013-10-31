package oo;

public enum Value {
    UNKNOWN {
        @Override public Value not() {
            return Value.UNKNOWN;
        }

        @Override public Value and(Value that) {
            if (that == null) throw new NullPointerException();
            if (that == Value.ZERO) return Value.ZERO; // ZEROÇ∆ÇÃANDââéZÇÕèÌÇ…ZERO
            else return Value.UNKNOWN;
        }

        @Override public Value or(Value that) {
            if (that == null) throw new NullPointerException();
            if (that == Value.ONE) return Value.ONE; // ONEÇ∆ÇÃORââéZÇÕèÌÇ…ONE
            else return Value.UNKNOWN;
        }
    },
    ZERO {
        @Override public Value not() {
            return Value.ONE;
        }

        @Override public Value and(Value that) {
            if (that == null) throw new NullPointerException();
            return Value.ZERO; // ZEROÇ∆ÇÃANDââéZÇÕèÌÇ…ZERO
        }

        @Override public Value or(Value that) {
            if (that == null) throw new NullPointerException();
            return that;
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
            return Value.ONE; // ONEÇ∆ÇÃORââéZÇÕèÌÇ…ONE
        }
    };

    abstract public Value not();
    abstract public Value and(Value that);
    abstract public Value or(Value that);
}
