package oo;

public class And {
    final Terminal[] input = {new Terminal(), new Terminal()};
    final Terminal output = new Terminal();

    public And() {
        for (Terminal in: input) {
            in.addListener(new TerminalListener() {
                @Override
                public void onChange(Value newValue) {
// TODO: input[0]�̒l�ƁAinput[1]�̒l��and()���ʂ��Aoutput�ɐݒ肵�Ă��������B
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
