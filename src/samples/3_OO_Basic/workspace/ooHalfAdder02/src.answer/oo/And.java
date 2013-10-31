package oo;

public class And extends Logic {
    public And() {
        super (2, 1);
        for (Terminal in: input) {
            in.addListener(new TerminalListener() {
                @Override
                public void onChange(Value newValue) {
                    output[0].setValue(input[0].getValue().and(input[1].getValue()));
                }
            });
        }
    }
}
