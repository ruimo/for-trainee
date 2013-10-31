package oo;

public class Not {
    final Terminal inputTerminal = new Terminal();
    final Terminal outputTerminal = new Terminal();

    public Not() {
        inputTerminal.addListener(new TerminalListener() {
            @Override
            public void onChange(Value newValue) {
                outputTerminal.setValue(newValue.not());
            }
        });
    }
    
    public Terminal getOutput(int index) {
        return outputTerminal;
    }

    public Terminal getInput(int index) {
        return inputTerminal;
    }
}
