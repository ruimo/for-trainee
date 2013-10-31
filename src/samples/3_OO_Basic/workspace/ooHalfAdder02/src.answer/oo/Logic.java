package oo;

public class Logic {
    protected final Terminal[] input;
    protected final Terminal[] output;

    public Logic(int inputTerminalCount, int outputTerminalCount) {
        this.input = new Terminal[inputTerminalCount];
        for (int i = 0; i < input.length; ++i)
            input[i] = new Terminal();

        this.output = new Terminal[outputTerminalCount];
        for (int i = 0; i < output.length; ++i)
            output[i] = new Terminal();
    }

    public Terminal getInput(int index) {
        return input[index];
    }

    public Terminal getOutput(int index) {
        return output[index];
    }

}