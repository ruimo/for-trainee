package procedural;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AndTest {
    @Test public void ����0��1�ŏo��0��Ԃ�() {
        assertThat(And.input(0, 1), is(0));
    }

    // TODO: AND��H�̐^���l�\���Q�Ƃ��ăe�X�g��ǉ����Ă��������B
}
