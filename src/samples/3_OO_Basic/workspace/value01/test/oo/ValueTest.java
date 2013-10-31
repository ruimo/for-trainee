package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ValueTest {
    @Test public void set�����l��get�ł���() {
        Value value = new Value();
        value.set(1);
        assertThat(value.get(), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void set������0�����̓G���[() {
        new Value().set(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void set������2�ȏ�̓G���[() {
        new Value().set(2);
    }
}
