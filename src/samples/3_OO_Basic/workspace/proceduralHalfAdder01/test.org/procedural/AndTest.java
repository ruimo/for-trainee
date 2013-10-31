package procedural;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AndTest {
    @Test public void 入力0と0で出力0を返す() {
        assertThat(And.input(0, 0), is(0));
    }

    @Test public void 入力0と1で出力0を返す() {
        assertThat(And.input(0, 1), is(0));
    }

    @Test public void 入力1と0で出力0を返す() {
        assertThat(And.input(1, 0), is(0));
    }

    @Test public void 入力1と1で出力1を返す() {
        assertThat(And.input(1, 1), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 入力0が0未満はエラー() {
        And.input(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 入力1が0未満はエラー() {
        And.input(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 入力0が2以上はエラー() {
        And.input(0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 入力1が2以上はエラー() {
        And.input(0, 2);
    }
}
