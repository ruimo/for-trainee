package procedural;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotTest {
    @Test public void 入力0で出力1を返す() {
        assertThat(Not.input(0), is(1));
    }
}
