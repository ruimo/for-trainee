package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ValueTest {
    @Test public void setした値がgetできる() {
        Value value = new Value();
        value.set(1);
        assertThat(value.get(), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void set引数が0未満はエラー() {
        new Value().set(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void set引数が2以上はエラー() {
        new Value().set(2);
    }
}
