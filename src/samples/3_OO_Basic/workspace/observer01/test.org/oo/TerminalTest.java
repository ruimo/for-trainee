package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TerminalTest {
    @Test public void connect‚³‚ê‚½’[q‚Éî•ñ‚ª“`‚í‚é() {
        Terminal from = new Terminal();
        Terminal to = new Terminal();
        from.addListener(to);

        assertThat(to.getValue(), is(Value.UNKNOWN));

        from.setValue(Value.ZERO);
        assertThat(to.getValue(), is(Value.ZERO));

        from.setValue(Value.ONE);
        assertThat(to.getValue(), is(Value.ONE));
    }
}
