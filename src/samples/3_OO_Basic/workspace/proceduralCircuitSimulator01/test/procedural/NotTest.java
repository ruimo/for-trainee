package procedural;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotTest {
    @Test public void ����0�ŏo��1��Ԃ�() {
        assertThat(Not.input(0), is(1));
    }

    @Test public void ����1�ŏo��0��Ԃ�() {
        assertThat(Not.input(1), is(0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ���͂�0�����̓G���[() {
        Not.input(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ���͂�2�ȏ�̓G���[() {
        Not.input(2);
    }
}
