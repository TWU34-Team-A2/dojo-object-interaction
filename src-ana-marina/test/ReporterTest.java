import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 11/1/13
 * Time: 11:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class ReporterTest {

    @Test
    public void reporterShouldReactToGoal() {
        Reporter reporter = new Reporter();
        String reaction = reporter.react();

        assertEquals("Yeah!", reaction);
    }
}
