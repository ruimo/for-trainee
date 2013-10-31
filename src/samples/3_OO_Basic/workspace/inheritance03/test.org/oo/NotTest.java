package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotTest {
    @Test public void ���͂�0���Əo�͂�1() {
        Not not = new Not();
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.ZERO);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.ONE));
    }

    @Test public void ���͂�1���Əo�͂�0() {
        Not not = new Not();
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.ONE);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.ZERO));
    }

    @Test public void ���͂�ݒ肵�Ă��Ȃ��Əo�͕͂s��() {
        Not not = new Not();
        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.UNKNOWN));
    }

//    @Test(expected = IndexOutOfBoundsException.class)
//    public void getInput�̓Y����1�ȏ�̓G���[() {
//        Not not = new Not();
//        not.getInput(1);
//    }
}
