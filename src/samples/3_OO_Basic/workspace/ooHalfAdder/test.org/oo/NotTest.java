package oo;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class NotTest {
    Logic not;
    @Before public void setup() {
        not = new Not();
    }

    @Test public void ���͂�0���Əo�͂�1() {
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.ZERO);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.ONE));
    }

    @Test public void ���͂�1���Əo�͂�0() {
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.ONE);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.ZERO));
    }

    @Test public void ���͂�ݒ肵�Ă��Ȃ��Əo�͕͂s��() {
        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.UNKNOWN));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void getInput�̓Y����1�ȏ�̓G���[() {
        not.getInput(1);
    }
}
