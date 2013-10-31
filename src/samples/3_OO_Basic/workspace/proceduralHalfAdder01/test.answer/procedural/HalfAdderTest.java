package procedural;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HalfAdderTest {
    @Test public void 入力00で出力00を返す() {
        int[] output = HalfAdder.input(0, 0);
        assertThat(output[0], is(0));
        assertThat(output[1], is(0));
    }
    
    @Test public void 入力01で出力01を返す() {
        int[] output = HalfAdder.input(0, 1);
        assertThat(output[0], is(0));
        assertThat(output[1], is(1));
    }

    @Test public void 入力10で出力01を返す() {
        int[] output = HalfAdder.input(1, 0);
        assertThat(output[0], is(0));
        assertThat(output[1], is(1));
    }

    @Test public void 入力11で出力10を返す() {
        int[] output = HalfAdder.input(1, 1);
        assertThat(output[0], is(1));
        assertThat(output[1], is(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 入力0が0未満はエラー() {
        HalfAdder.input(-1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 入力1が0未満はエラー() {
        HalfAdder.input(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 入力0が2以上はエラー() {
        HalfAdder.input(2, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 入力1が2以上はエラー() {
        HalfAdder.input(0, 2);
    }
}
