package procedural;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OrTest {
    @Test public void ����0��0�ŏo��0��Ԃ�() {
        assertThat(Or.input(0, 0), is(0));
    }

    @Test public void ����0��1�ŏo��1��Ԃ�() {
        assertThat(Or.input(0, 1), is(1));
    }

    @Test public void ����1��0�ŏo��1��Ԃ�() {
        assertThat(Or.input(1, 0), is(1));
    }

    @Test public void ����1��1�ŏo��1��Ԃ�() {
        assertThat(Or.input(1, 1), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ����0��0�����̓G���[() {
        Or.input(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ����1��0�����̓G���[() {
        Or.input(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ����0��2�ȏ�̓G���[() {
        Or.input(0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ����1��2�ȏ�̓G���[() {
        Or.input(0, 2);
    }
}
