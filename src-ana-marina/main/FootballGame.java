import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 11/1/13
 * Time: 11:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class FootballGame {
    public Team teamA;
    private List<Spectator> spectators;

    public FootballGame(Team teamA, Team teamB, List<Spectator> spectators) {
        this.teamA = teamA;
        this.spectators = spectators;
    }

    public String teamAScore() {
        teamA.score();
        return getReactions();
    }

    private String getReactions() {
        String reaction = "";
        for(Spectator spectator: spectators) {
            reaction += spectator.react() + "\n";
        }
        return reaction;
    }
}
