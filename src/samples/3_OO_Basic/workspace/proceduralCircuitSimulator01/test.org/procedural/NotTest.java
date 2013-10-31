package procedural;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NotTest {
    @Test public void “ü—Í0‚Åo—Í1‚ğ•Ô‚·() {
        assertThat(Not.input(0), is(1));
    }
}
