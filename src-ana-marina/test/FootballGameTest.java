import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 11/1/13
 * Time: 11:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class FootballGameTest {

    @Mock
    Team teamA;

    FootballGame footballGame;
    List<Spectator> spectators;

    @org.junit.Before
    public void setUp() throws Exception {
        initMocks(this);
        Team teamB = new Team("B");
        spectators = new ArrayList<Spectator>();
        spectators.add(new Reporter());
        spectators.add(new Fan());
        spectators.add(new ScoreBoard());
        footballGame = new FootballGame(teamA, teamB, spectators);
    }

    @Test
    public void reporterShouldReactToGoal() {
        String reaction = footballGame.teamAScore();
        assertTrue(reaction.contains("Yeah"));
    }

    @Test
    public void fanShouldReactToGoal() {
        String reaction = footballGame.teamAScore();
        assertTrue(reaction.contains("Yeah team"));
    }

    @Test
    public void scoreBoardShouldReactToGoal() {
        String reaction = footballGame.teamAScore();
        assertTrue(reaction.contains("Score!"));
    }

    @Test
    public void teamAShouldScore() throws Exception {
        footballGame.teamAScore();
        verify(teamA).score();
    }
}
