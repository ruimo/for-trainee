package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ValueTest {
    @Test public void not() {
        assertThat(Value.UNKNOWN.not(), is(Value.UNKNOWN));
        assertThat(Value.ZERO.not(), is(Value.ONE));
        assertThat(Value.ONE.not(), is(Value.ZERO));
    }
}
