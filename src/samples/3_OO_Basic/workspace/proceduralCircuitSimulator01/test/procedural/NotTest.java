package procedural;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotTest {
    @Test public void 入力0で出力1を返す() {
        assertThat(Not.input(0), is(1));
    }

    @Test public void 入力1で出力0を返す() {
        assertThat(Not.input(1), is(0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void 入力が0未満はエラー() {
        Not.input(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 入力が2以上はエラー() {
        Not.input(2);
    }
}
