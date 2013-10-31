package oo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TerminalTest {
    @Test public void connectされた端子に情報が伝わる() {
        Terminal from = new Terminal();
        Terminal to = new Terminal();
        from.connectTo(to);

        assertThat(to.getValue(), is(Value.UNKNOWN));

        from.setValue(Value.ZERO);
        assertThat(to.getValue(), is(Value.ZERO));

        from.setValue(Value.ONE);
        assertThat(to.getValue(), is(Value.ONE));
    }

    @Test public void 端子を監視する() {
        final Value[] latestValue = {Value.UNKNOWN};

        Terminal terminal = new Terminal();
        terminal.addListener(new TerminalListener() {
            @Override public void onChange(Value newValue) {
                latestValue[0] = newValue;
            }
        });

        assertThat(latestValue[0], is(Value.UNKNOWN));

        terminal.setValue(Value.ZERO);
        assertThat(latestValue[0], is(Value.ZERO));

        terminal.setValue(Value.ONE);
        assertThat(latestValue[0], is(Value.ONE));
    }
}
