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

    @Test public void ���͂�0��0���Əo�͂�0() {
        or.getInput(0).setValue(Value.ZERO);
        or.getInput(1).setValue(Value.ZERO);

        assertThat(or.getOutput(0).getValue(), is(Value.ZERO));
    }

    @Test public void ���͂�0��1���Əo�͂�1() {
        or.getInput(0).setValue(Value.ZERO);
        or.getInput(1).setValue(Value.ONE);

        assertThat(or.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void ���͂�0�ƕs�肾�Əo�͕͂s��() {
        or.getInput(0).setValue(Value.ZERO);
        or.getInput(1).setValue(Value.UNKNOWN);

        assertThat(or.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void ���͂�1��0���Əo�͂�1() {
        or.getInput(0).setValue(Value.ONE);
        or.getInput(1).setValue(Value.ZERO);

        assertThat(or.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void ���͂�1��1���Əo�͂�1() {
        or.getInput(0).setValue(Value.ONE);
        or.getInput(1).setValue(Value.ONE);

        assertThat(or.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void ���͂�1�ƕs�肾�Əo�͂�1() {
        or.getInput(0).setValue(Value.ONE);
        or.getInput(1).setValue(Value.UNKNOWN);

        assertThat(or.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void ���͂��s���0���Əo�͕͂s��() {
        or.getInput(0).setValue(Value.UNKNOWN);
        or.getInput(1).setValue(Value.ZERO);

        assertThat(or.getOutput(0).getValue(), is(Value.UNKNOWN));
    }

    @Test public void ���͂��s���1���Əo�͂�1() {
        or.getInput(0).setValue(Value.UNKNOWN);
        or.getInput(1).setValue(Value.ONE);

        assertThat(or.getOutput(0).getValue(), is(Value.ONE));
    }

    @Test public void ���͂��s��ƕs�肾�Əo�͕͂s��() {
        or.getInput(0).setValue(Value.UNKNOWN);
        or.getInput(1).setValue(Value.UNKNOWN);

        assertThat(or.getOutput(0).getValue(), is(Value.UNKNOWN));
    }
}
