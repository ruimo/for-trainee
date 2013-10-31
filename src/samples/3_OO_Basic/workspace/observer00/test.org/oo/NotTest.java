package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotTest {
    @Test public void 入力0で出力1を返す() {
        Not not = new Not();
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.ZERO);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.ONE));
    }

    @Test public void 入力1で出力0を返す() {
        Not not = new Not();
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.ONE);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.ZERO));
    }

    @Test public void 入力を設定していないなら出力は不定() {
        Not not = new Not();
        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.UNKNOWN));
    }

    @Test public void 入力不定なら出力も不定() {
        Not not = new Not();
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.UNKNOWN);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.UNKNOWN));
    }

    @Test public void connectされた端子に情報が伝わる() {
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
