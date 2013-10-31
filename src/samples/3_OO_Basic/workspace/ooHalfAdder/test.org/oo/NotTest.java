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

    @Test public void 入力が0だと出力は1() {
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.ZERO);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.ONE));
    }

    @Test public void 入力が1だと出力は0() {
        Terminal inputTerminal = not.getInput(0);
        inputTerminal.setValue(Value.ONE);

        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.ZERO));
    }

    @Test public void 入力を設定していないと出力は不定() {
        Terminal outputTerminal = not.getOutput(0);
        assertThat(outputTerminal.getValue(), is(Value.UNKNOWN));
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void getInputの添字が1以上はエラー() {
        not.getInput(1);
    }
}
