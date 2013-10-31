package oo;

public class Not {
    final Terminal inputTerminal = new Terminal();
    final Terminal outputTerminal = new Terminal();

    public Terminal getOutput(int index) {
        return outputTerminal;
    }

    public Terminal getInput(int index) {
        return inputTerminal;
    }
}
