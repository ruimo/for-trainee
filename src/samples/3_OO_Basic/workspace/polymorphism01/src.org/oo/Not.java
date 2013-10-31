package oo;

public class Not {
    final Terminal inputTerminal = new Terminal();
    final Terminal outputTerminal = new Terminal();

    public Not() {
        inputTerminal.addListener(new TerminalListener() {
            @Override
            public void onChange(Value newValue) {
                // TODO: Value.not()を使用するように変更してください。
                switch (newValue) {
                case UNKNOWN:
                    outputTerminal.setValue(Value.UNKNOWN);
                    break;
                    
                case ZERO:
                    outputTerminal.setValue(Value.ONE);
                    break;
                    
                case ONE:
                    outputTerminal.setValue(Value.ZERO);
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
