package procedural;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AndTest {
    @Test public void ����0��0�ŏo��0��Ԃ�() {
        assertThat(And.input(0, 0), is(0));
    }

    @Test public void ����0��1�ŏo��0��Ԃ�() {
        assertThat(And.input(0, 1), is(0));
    }

    @Test public void ����1��0�ŏo��0��Ԃ�() {
        assertThat(And.input(1, 0), is(0));
    }

    @Test public void ����1��1�ŏo��1��Ԃ�() {
        assertThat(And.input(1, 1), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ����0��0�����̓G���[() {
        And.input(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ����0��2�ȏ�̓G���[() {
        And.input(2, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ����1��0�����̓G���[() {
        And.input(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ����1��2�ȏ�̓G���[() {
        And.input(0, 2);
    }
}