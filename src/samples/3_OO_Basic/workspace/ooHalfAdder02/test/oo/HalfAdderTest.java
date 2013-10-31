package oo;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HalfAdderTest {
    Logic halfAdder;
    @Before public void setup() {
        halfAdder = new HalfAdder();
    }

    @Test public void 入力が0と0だと出力は00() {
        halfAdder.getInput(0).setValue(Value.ZERO);
        halfAdder.getInput(1).setValue(Value.ZERO);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.ZERO));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void 入力が0と1だと出力は01() {
        halfAdder.getInput(0).setValue(Value.ZERO);
        halfAdder.getInput(1).setValue(Value.ONE);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.ZERO));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void 入力が0と不定だと出力は0不定() {
        halfAdder.getInput(0).setValue(Value.ZERO);
        halfAdder.getInput(1).setValue(Value.UNKNOWN);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.ZERO));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void 入力が1と0だと出力は01() {
        halfAdder.getInput(0).setValue(Value.ONE);
        halfAdder.getInput(1).setValue(Value.ZERO);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.ZERO));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void 入力が1と1だと出力は10() {
        halfAdder.getInput(0).setValue(Value.ONE);
        halfAdder.getInput(1).setValue(Value.ONE);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.ONE));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void 入力が1と不定だと出力は不定不定() {
        halfAdder.getInput(0).setValue(Value.ONE);
        halfAdder.getInput(1).setValue(Value.UNKNOWN);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.UNKNOWN));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void 入力が不定と0だと出力は0不定() {
        halfAdder.getInput(0).setValue(Value.UNKNOWN);
        halfAdder.getInput(1).setValue(Value.ZERO);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.ZERO));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void 入力が不定と1だと出力は不定不定() {
        halfAdder.getInput(0).setValue(Value.UNKNOWN);
        halfAdder.getInput(1).setValue(Value.ONE);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.UNKNOWN));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.UNKNOWN));
    }
    
    @Test public void 入力が不定と不定だと出力は不定不定() {
        halfAdder.getInput(0).setValue(Value.UNKNOWN);
        halfAdder.getInput(1).setValue(Value.UNKNOWN);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.UNKNOWN));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.UNKNOWN));
    }
}
