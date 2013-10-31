package oo;

public class Not {
    final Terminal input = new Terminal();
    final Terminal output = new Terminal();

    public Not() {
        input.addListener(new TerminalListener() {
            @Override
            public void onChange(Value newValue) {
                output.setValue(newValue.not());
            }
        });
    }
    
    public Terminal getOutput(int index) {
        return output;
    }

    public Terminal getInput(int index) {
        return input;
    }
}
