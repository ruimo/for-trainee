package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ValueTest {
    @Test public void �ݒ肵���l��get�ł���() {
        Value value = new Value(1);
        assertThat(value.get(), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void �ݒ肵���l��0�����̓G���[() {
        new Value(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void �ݒ肵���l��2�ȏ�̓G���[() {
        new Value(2);
    }
}
