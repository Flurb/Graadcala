/*
 * 2019 Flurb
 */
package nl.flurb.graadcala.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Full configuration of the Graadcala game.
 * Stored in H2 database.
 */
@Entity
public class GameSetup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * The number of small pits, besides the big one.
     */
    private int numberOfSmallPits;

    public GameSetup() {}

    public GameSetup(int numberOfSmallPits) {
        this.numberOfSmallPits = numberOfSmallPits;
    }

    public int getNumberOfSmallPits() {
        return  numberOfSmallPits;
    }

    public void setNumberOfSmallPits(int numberOfSmallPits) {
        this.numberOfSmallPits = numberOfSmallPits;
    }
}
