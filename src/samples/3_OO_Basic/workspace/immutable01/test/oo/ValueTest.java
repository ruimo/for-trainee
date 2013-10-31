package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ValueTest {
    @Test public void 設定した値がgetできる() {
        Value value = new Value(1);
        assertThat(value.get(), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 設定した値が0未満はエラー() {
        new Value(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 設定した値が2以上はエラー() {
        new Value(2);
    }
}
