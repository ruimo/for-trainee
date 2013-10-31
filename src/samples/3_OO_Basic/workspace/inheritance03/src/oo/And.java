package oo;

public class And {
    final Terminal[] input = {new Terminal(), new Terminal()};
    final Terminal output = new Terminal();

    public And() {
        for (Terminal in: input) {
            in.addListener(new TerminalListener() {
                @Override
                public void onChange(Value newValue) {
                    output.setValue(input[0].getValue().and(input[1].getValue()));
                }
            });
        }
    }
    
    public Terminal getInput(int index) {
        return input[index];
    }

    public Terminal getOutput(int index) {
        return output;
    }
}
