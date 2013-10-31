package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotTest {
    @Test public void 入力が0だと出力は1() {
        Not not = new Not();
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.ZERO);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.ONE));
    }

    @Test public void 入力が1だと出力は0() {
        Not not = new Not();
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.ONE);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.ZERO));
    }

    @Test public void 入力を設定していないと出力は不定() {
        Not not = new Not();
        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.UNKNOWN));
    }

//    @Test(expected = IndexOutOfBoundsException.class)
//    public void getInputの添字が1以上はエラー() {
//        Not not = new Not();
//        not.getInput(1);
//    }
}
