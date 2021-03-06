package oo;

public class Not {
    final Terminal inputTerminal = new Terminal();
    final Terminal outputTerminal = new Terminal();

    public Not() {
        // TODO: inputTerminalの状態が変化したら、その反転をoutputTerminalに設定します。

        inputTerminal.addListener(new TerminalListener() {
            @Override
            public void onChange(Value newValue) {
                switch (newValue) {
                case UNKNOWN:
                    outputTerminal.setValue(Value.UNKNOWN);
                    break;
                    
                case ZERO:
                    outputTerminal.setValue(???);
                    break;
                    
                case ONE:
                    outputTerminal.setValue(???);
                    break;
                }
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
