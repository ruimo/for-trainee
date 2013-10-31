package oo;

public class Or extends Logic {
    public Or() {
        super (2, 1);
        for (Terminal in: input) {
            in.addListener(new TerminalListener() {
                @Override
                public void onChange(Value newValue) {
                    output[0].setValue(input[0].getValue().or(input[1].getValue()));
                }
            });
        }
    }
}
