import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 11/1/13
 * Time: 12:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class ScoreBoardTest {

    @Test
    public void scoreBoardShouldReactToGoal() {
        ScoreBoard scoreBoard = new ScoreBoard();
        String reaction = scoreBoard.react();

        assertEquals("Score!", reaction);
    }
}
