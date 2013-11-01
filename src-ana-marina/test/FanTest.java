import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 11/1/13
 * Time: 11:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class FanTest {

    @Test
    public void reporterShouldReactToGoal() {
        Fan fan = new Fan();
        String reaction = fan.react();

        assertEquals("Yeah team!", reaction);
    }
}
