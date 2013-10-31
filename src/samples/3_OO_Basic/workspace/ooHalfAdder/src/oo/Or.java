package oo;

public class Or extends Logic {
    public Or() {
        super (2);
        for (Terminal in: input) {
            in.addListener(new TerminalListener() {
                @Override
                public void onChange(Value newValue) {
                    output.setValue(input[0].getValue().or(input[1].getValue()));
                }
            });
        }
    }
}
