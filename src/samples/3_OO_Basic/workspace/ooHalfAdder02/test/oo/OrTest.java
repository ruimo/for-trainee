package oo;

import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OrTest {
    Logic or;
    @Before public void setup() {
        or = new Or();
    }

    @Test public void 入力が0と0だと出力は0() {
        or.getInput(0).setValue(Value.ZERO);
        or.getInput(1).setValue(Value.ZERO);

        assertThat(or.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void 入力が0と1だと出力は1() {
        or.getInput(0).setValue(Value.ZERO);
        or.getInput(1).setValue(Value.ONE);

        assertThat(or.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void 入力が0と不定だと出力は不定() {
        or.getInput(0).setValue(Value.ZERO);
        or.getInput(1).setValue(Value.UNKNOWN);

        assertThat(or.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void 入力が1と0だと出力は1() {
        or.getInput(0).setValue(Value.ONE);
        or.getInput(1).setValue(Value.ZERO);

        assertThat(or.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void 入力が1と1だと出力は1() {
        or.getInput(0).setValue(Value.ONE);
        or.getInput(1).setValue(Value.ONE);

        assertThat(or.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void 入力が1と不定だと出力は1() {
        or.getInput(0).setValue(Value.ONE);
        or.getInput(1).setValue(Value.UNKNOWN);

        assertThat(or.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void 入力が不定と0だと出力は不定() {
        or.getInput(0).setValue(Value.UNKNOWN);
        or.getInput(1).setValue(Value.ZERO);

        assertThat(or.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void 入力が不定と1だと出力は1() {
        or.getInput(0).setValue(Value.UNKNOWN);
        or.getInput(1).setValue(Value.ONE);

        assertThat(or.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void 入力が不定と不定だと出力は不定() {
        or.getInput(0).setValue(Value.UNKNOWN);
        or.getInput(1).setValue(Value.UNKNOWN);

        assertThat(or.getOutput(0).getValue(), is(Value.UNKNOWN));
    }
}
