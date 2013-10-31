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

    @Test public void and() {
        assertThat(Value.UNKNOWN.and(Value.UNKNOWN), is(Value.UNKNOWN));
        assertThat(Value.UNKNOWN.and(Value.ZERO), is(Value.ZERO));
        assertThat(Value.UNKNOWN.and(Value.ONE), is(Value.UNKNOWN));

        assertThat(Value.ZERO.and(Value.UNKNOWN), is(Value.ZERO));
        assertThat(Value.ZERO.and(Value.ZERO), is(Value.ZERO));
        assertThat(Value.ZERO.and(Value.ONE), is(Value.ZERO));

        assertThat(Value.ONE.and(Value.UNKNOWN), is(Value.UNKNOWN));
        assertThat(Value.ONE.and(Value.ZERO), is(Value.ZERO));
        assertThat(Value.ONE.and(Value.ONE), is(Value.ONE));
    }

    @Test public void or() {
        assertThat(Value.UNKNOWN.or(Value.UNKNOWN), is(Value.UNKNOWN));
        assertThat(Value.UNKNOWN.or(Value.ZERO), is(Value.UNKNOWN));
        assertThat(Value.UNKNOWN.or(Value.ONE), is(Value.ONE));

        assertThat(Value.ZERO.or(Value.UNKNOWN), is(Value.UNKNOWN));
        assertThat(Value.ZERO.or(Value.ZERO), is(Value.ZERO));
        assertThat(Value.ZERO.or(Value.ONE), is(Value.ONE));

        assertThat(Value.ONE.or(Value.UNKNOWN), is(Value.ONE));
        assertThat(Value.ONE.or(Value.ZERO), is(Value.ONE));
        assertThat(Value.ONE.or(Value.ONE), is(Value.ONE));
    }
}
