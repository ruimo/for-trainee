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

    @Test public void 入力を設定していないなら出力は不定() {
        Not not = new Not();
        assertThat(not.getOutput(0), is(Value.UNKNOWN));
    }

    @Test public void 入力不定なら出力も不定() {
        Not not = new Not();
        not.setInput(0, Value.UNKNOWN);

        assertThat(not.getOutput(0), is(Value.UNKNOWN));
    }

    @Test(expected = NullPointerException.class) public void 入力がnullならエラー() {
        Not not = new Not();
        not.setInput(0, null);
    }
}
