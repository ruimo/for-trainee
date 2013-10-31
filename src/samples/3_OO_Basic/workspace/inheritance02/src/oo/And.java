package oo;

public class And {
    final Terminal[] input = {new Terminal(), new Terminal()};
    final Terminal output = new Terminal();

    public And() {
        for (Terminal in: input) {
            in.addListener(new TerminalListener() {
                @Override
                public void onChange(Value newValue) {
// TODO: input[0]の値と、input[1]の値のand()結果を、outputに設定してください。
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
