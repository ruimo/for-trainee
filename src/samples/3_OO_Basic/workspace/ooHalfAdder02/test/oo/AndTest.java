package oo;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AndTest {
    Logic and;
    @Before public void setup() {
        and = new And();
    }


    @Test public void 入力が0と0だと出力は0() {
        and.getInput(0).setValue(Value.ZERO);
        and.getInput(1).setValue(Value.ZERO);

        assertThat(and.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void 入力が0と1だと出力は0() {
        and.getInput(0).setValue(Value.ZERO);
        and.getInput(1).setValue(Value.ONE);

        assertThat(and.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void 入力が0と不定だと出力は0() {
        and.getInput(0).setValue(Value.ZERO);
        and.getInput(1).setValue(Value.UNKNOWN);

        assertThat(and.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void 入力が1と0だと出力は0() {
        and.getInput(0).setValue(Value.ONE);
        and.getInput(1).setValue(Value.ZERO);

        assertThat(and.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void 入力が1と1だと出力は1() {
        and.getInput(0).setValue(Value.ONE);
        and.getInput(1).setValue(Value.ONE);

        assertThat(and.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void 入力が1と不定だと出力は不定() {
        and.getInput(0).setValue(Value.ONE);
        and.getInput(1).setValue(Value.UNKNOWN);

        assertThat(and.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void 入力が不定と0だと出力は0() {
        and.getInput(0).setValue(Value.UNKNOWN);
        and.getInput(1).setValue(Value.ZERO);

        assertThat(and.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void 入力が不定と1だと出力は不定() {
        and.getInput(0).setValue(Value.UNKNOWN);
        and.getInput(1).setValue(Value.ONE);

        assertThat(and.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void 入力が不定と不定だと出力は不定() {
        and.getInput(0).setValue(Value.UNKNOWN);
        and.getInput(1).setValue(Value.UNKNOWN);

        assertThat(and.getOutput(0).getValue(), is(Value.UNKNOWN));
    }
}
