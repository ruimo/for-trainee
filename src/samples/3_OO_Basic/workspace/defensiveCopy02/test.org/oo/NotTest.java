package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotTest {
    @Test public void 入力0で出力1を返す() {
        // 入力0を作成
        Value value = new Value();
        value.set(0);

        // Not回路を作成して、入力0に値を設定
        Not not = new Not();
        not.setInput(0, value);

        assertThat(not.getOutput(0).get(), is(1));
    }

    @Test public void 入力1で出力0を返す() {
        // 入力1を作成
        Value value = new Value();
        value.set(1);

        // Not回路を作成して、入力0に値を設定
        Not not = new Not();
        not.setInput(0, value);

        assertThat(not.getOutput(0).get(), is(0));
    }

    @Test public void not回路2つでテスト() {
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
