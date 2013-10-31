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
        // ����1���쐬
        Value value = new Value();
        value.set(1);

        // Not��H���쐬���āA����0�ɒl��ݒ�
        Not not = new Not();
        not.setInput(0, value);

        assertThat(not.getOutput(0).get(), is(0));
    }

    @Test public void not��H2�Ńe�X�g() {
        Value value = new Value();
        Not not = new Not();
        Not not2 = new Not();

        value.set(1);
        not.setInput(0, value);

        value.set(0);
        not2.setInput(0, value);
        
        assertThat(not.getOutput(0).get(), is(0));
        assertThat(not2.getOutput(0).get(), is(1));
    }
}
