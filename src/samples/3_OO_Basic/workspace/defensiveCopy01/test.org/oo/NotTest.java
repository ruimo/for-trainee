package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotTest {
    @Test public void ����0�ŏo��1��Ԃ�() {
        // ����0���쐬
        Value value = new Value();
        value.set(0);

        // Not��H���쐬���āA����0�ɒl��ݒ�
        Not not = new Not();
        not.setInput(0, value);

        assertThat(not.getOutput(0).get(), is(1));
    }

    @Test public void ����1�ŏo��0��Ԃ�() {
        // TODO: �������Ă��������B
    }
}
