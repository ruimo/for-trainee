package oo;

public class Not {
    final Terminal inputTerminal = new Terminal();
    final Terminal outputTerminal = new Terminal();

    public Not() {
        // TODO: inputTerminal‚Ìó‘Ô‚ª•Ï‰»‚µ‚½‚çA‚»‚Ì”½“]‚ğoutputTerminal‚Éİ’è‚µ‚Ü‚·B

        inputTerminal.addListener(new TerminalListener() {
            @Override
            public void onChange(Value newValue) {
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
