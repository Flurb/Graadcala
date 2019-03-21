package nl.flurb.graadcala.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GameSetup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int numberOfSmallPits;

    private String playerName;

    public GameSetup() {}

    public GameSetup(int numberOfSmallPits) {
        this.numberOfSmallPits = numberOfSmallPits;
    }

    public GameSetup(String playerName) {
        this.playerName = playerName;
    }

    public GameSetup(int numberOfSmallPits, String playerName) {
        this.numberOfSmallPits = numberOfSmallPits;
        this.playerName = playerName;
    }

    public int getNumberOfSmallPits() {
        return  numberOfSmallPits;
    }

    public void setNumberOfSmallPits(int numberOfSmallPits) {
        this.numberOfSmallPits = numberOfSmallPits;
    }

    public String getPlayerName() {
        return  playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
