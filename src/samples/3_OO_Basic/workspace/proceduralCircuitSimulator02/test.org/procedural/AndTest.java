package procedural;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AndTest {
    @Test public void 入力0と1で出力0を返す() {
        assertThat(And.input(0, 1), is(0));
    }

    // TODO: AND回路の真理値表を参照してテストを追加してください。
}
