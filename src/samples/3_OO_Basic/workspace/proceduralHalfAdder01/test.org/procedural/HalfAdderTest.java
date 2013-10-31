package procedural;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HalfAdderTest {
    @Test public void ����00�ŏo��00��Ԃ�() {
        int[] output = HalfAdder.input(0, 0);
        assertThat(output[0], is(0));
        assertThat(output[1], is(0));
    }
    
    @Test public void ����01�ŏo��01��Ԃ�() {
        int[] output = HalfAdder.input(0, 1);
        assertThat(output[0], is(0));
        assertThat(output[1], is(1));
    }

    @Test public void ����10�ŏo��01��Ԃ�() {
        int[] output = HalfAdder.input(1, 0);
        assertThat(output[0], is(0));
        assertThat(output[1], is(1));
    }

    @Test public void ����11�ŏo��10��Ԃ�() {
        int[] output = HalfAdder.input(1, 1);
        assertThat(output[0], is(1));
        assertThat(output[1], is(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void ����0��0�����̓G���[() {
        HalfAdder.input(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ����1��0�����̓G���[() {
        HalfAdder.input(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ����0��2�ȏ�̓G���[() {
        HalfAdder.input(2, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ����1��2�ȏ�̓G���[() {
        HalfAdder.input(0, 2);
    }
}
