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


    @Test public void ���͂�0��0���Əo�͂�0() {
        and.getInput(0).setValue(Value.ZERO);
        and.getInput(1).setValue(Value.ZERO);

        assertThat(and.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void ���͂�0��1���Əo�͂�0() {
        and.getInput(0).setValue(Value.ZERO);
        and.getInput(1).setValue(Value.ONE);

        assertThat(and.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void ���͂�0�ƕs�肾�Əo�͂�0() {
        and.getInput(0).setValue(Value.ZERO);
        and.getInput(1).setValue(Value.UNKNOWN);

        assertThat(and.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void ���͂�1��0���Əo�͂�0() {
        and.getInput(0).setValue(Value.ONE);
        and.getInput(1).setValue(Value.ZERO);

        assertThat(and.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void ���͂�1��1���Əo�͂�1() {
        and.getInput(0).setValue(Value.ONE);
        and.getInput(1).setValue(Value.ONE);

        assertThat(and.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void ���͂�1�ƕs�肾�Əo�͕͂s��() {
        and.getInput(0).setValue(Value.ONE);
        and.getInput(1).setValue(Value.UNKNOWN);

        assertThat(and.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void ���͂��s���0���Əo�͂�0() {
        and.getInput(0).setValue(Value.UNKNOWN);
        and.getInput(1).setValue(Value.ZERO);

        assertThat(and.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void ���͂��s���1���Əo�͕͂s��() {
        and.getInput(0).setValue(Value.UNKNOWN);
        and.getInput(1).setValue(Value.ONE);

        assertThat(and.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void ���͂��s��ƕs�肾�Əo�͕͂s��() {
        and.getInput(0).setValue(Value.UNKNOWN);
        and.getInput(1).setValue(Value.UNKNOWN);

        assertThat(and.getOutput(0).getValue(), is(Value.UNKNOWN));
    }
}
