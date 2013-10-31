package oo;

public class Logic {
    protected final Terminal[] input;
    protected final Terminal output = new Terminal();

    public Logic(int inputTerminalCount) {
        this.input = new Terminal[inputTerminalCount];
        for (int i = 0; i < input.length; ++i)
            input[i] = new Terminal();
    }

    public Terminal getInput(int index) {
        return input[index];
    }

    public Terminal getOutput(int index) {
        return output;
    }

}