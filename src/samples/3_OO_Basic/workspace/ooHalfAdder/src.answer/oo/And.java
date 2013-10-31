package oo;

public class And extends Logic {
    public And() {
        super (2);
        for (Terminal in: input) {
            in.addListener(new TerminalListener() {
                @Override
                public void onChange(Value newValue) {
                    output.setValue(input[0].getValue().and(input[1].getValue()));
                }
            });
        }
    }
}
