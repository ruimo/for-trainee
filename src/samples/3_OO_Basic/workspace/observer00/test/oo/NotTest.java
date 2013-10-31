package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotTest {
    @Test public void ����0�ŏo��1��Ԃ�() {
        Not not = new Not();
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.ZERO);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.ONE));
    }

    @Test public void ����1�ŏo��0��Ԃ�() {
        Not not = new Not();
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.ONE);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.ZERO));
    }

    @Test public void ���͂�ݒ肵�Ă��Ȃ��Ȃ�o�͕͂s��() {
        Not not = new Not();
        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.UNKNOWN));
    }

    @Test public void ���͕s��Ȃ�o�͂��s��() {
        Not not = new Not();
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.UNKNOWN);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.UNKNOWN));
    }

    @Test public void connect���ꂽ�[�q�ɏ�񂪓`���() {
        Terminal from = new Terminal();
        Terminal to = new Terminal();
        from.addListener(to);

        assertThat(to.getValue(), is(Value.UNKNOWN));

        from.setValue(Value.ZERO);
        assertThat(to.getValue(), is(Value.ZERO));

        from.setValue(Value.ONE);
        assertThat(to.getValue(), is(Value.ONE));
    }
}
