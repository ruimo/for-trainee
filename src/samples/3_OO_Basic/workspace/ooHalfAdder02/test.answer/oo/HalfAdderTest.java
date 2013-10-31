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

    @Test public void ���͂�0��0���Əo�͂�00() {
        halfAdder.getInput(0).setValue(Value.ZERO);
        halfAdder.getInput(1).setValue(Value.ZERO);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.ZERO));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void ���͂�0��1���Əo�͂�01() {
        halfAdder.getInput(0).setValue(Value.ZERO);
        halfAdder.getInput(1).setValue(Value.ONE);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.ZERO));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void ���͂�0�ƕs�肾�Əo�͂�0�s��() {
        halfAdder.getInput(0).setValue(Value.ZERO);
        halfAdder.getInput(1).setValue(Value.UNKNOWN);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.ZERO));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void ���͂�1��0���Əo�͂�01() {
        halfAdder.getInput(0).setValue(Value.ONE);
        halfAdder.getInput(1).setValue(Value.ZERO);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.ZERO));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void ���͂�1��1���Əo�͂�10() {
        halfAdder.getInput(0).setValue(Value.ONE);
        halfAdder.getInput(1).setValue(Value.ONE);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.ONE));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void ���͂�1�ƕs�肾�Əo�͕͂s��s��() {
        halfAdder.getInput(0).setValue(Value.ONE);
        halfAdder.getInput(1).setValue(Value.UNKNOWN);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.UNKNOWN));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void ���͂��s���0���Əo�͂�0�s��() {
        halfAdder.getInput(0).setValue(Value.UNKNOWN);
        halfAdder.getInput(1).setValue(Value.ZERO);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.ZERO));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void ���͂��s���1���Əo�͕͂s��s��() {
        halfAdder.getInput(0).setValue(Value.UNKNOWN);
        halfAdder.getInput(1).setValue(Value.ONE);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.UNKNOWN));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.UNKNOWN));
    }
    
    @Test public void ���͂��s��ƕs�肾�Əo�͕͂s��s��() {
        halfAdder.getInput(0).setValue(Value.UNKNOWN);
        halfAdder.getInput(1).setValue(Value.UNKNOWN);

        assertThat(halfAdder.getOutput(1).getValue(), is(Value.UNKNOWN));
        assertThat(halfAdder.getOutput(0).getValue(), is(Value.UNKNOWN));
    }
}
