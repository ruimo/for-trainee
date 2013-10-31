package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotTest {
    @Test public void ����0�ŏo��1��Ԃ�() {
        Not not = new Not();
        not.setInput(0, Value.ZERO);
        assertThat(not.getOutput(0), is(Value.ONE));
    }

    @Test public void ����1�ŏo��0��Ԃ�() {
        Not not = new Not();
        not.setInput(0, Value.ONE);
        assertThat(not.getOutput(0), is(Value.ZERO));
    }

    @Test(expected = NullPointerException.class)
    public void ����null�̓G���[() {
        Not not = new Not();
        not.setInput(0, null);
    }
    // TODO: Not.setInput()���Anull������NullPointerExceptio���X���[��
    // �邱�Ƃ��`�F�b�N����B
}
