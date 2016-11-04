import java.util.Date;

/**
 * Created by adamscharf on 10/2/15.
 */
public class BoardGame implements Playable {
    private int minPlayerNumber;
    private int maxPlayerNumber;
    private int recommendedPlayerNumber;
    private Date lastDatePlayed;

    /**
     * Default constructor
     */
    public BoardGame() { }

//    public BoardGame(client) {
//
//    }

    @Override
    public int getMinPlayerNumber() {
        return 0;
    }

    @Override
    public int getMaxPlayerNumber() {
        return 0;
    }

    @Override
    public int getRecommendedPlayerNumber() {
        return 0;
    }
}
