package oo;

public class Not extends Logic {
    public Not() {
        super (1, 1);
        input[0].addListener(new TerminalListener() {
            @Override
            public void onChange(Value newValue) {
                output[0].setValue(newValue.not());
            }
        });
    }
}
