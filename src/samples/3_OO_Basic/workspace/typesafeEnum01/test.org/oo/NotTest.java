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
        // TODO: 実装してください。
    }

    // TODO: Not.setInput()が、null引数でNullPointerExceptioをスローす
    // ることをチェックする。
}
