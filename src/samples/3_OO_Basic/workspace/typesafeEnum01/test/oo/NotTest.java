package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotTest {
    @Test public void 入力0で出力1を返す() {
        Not not = new Not();
        not.setInput(0, Value.ZERO);
        assertThat(not.getOutput(0), is(Value.ONE));
    }

    @Test public void 入力1で出力0を返す() {
        Not not = new Not();
        not.setInput(0, Value.ONE);
        assertThat(not.getOutput(0), is(Value.ZERO));
    }

    @Test(expected = NullPointerException.class)
    public void 入力nullはエラー() {
        Not not = new Not();
        not.setInput(0, null);
    }
    // TODO: Not.setInput()が、null引数でNullPointerExceptioをスローす
    // ることをチェックする。
}
