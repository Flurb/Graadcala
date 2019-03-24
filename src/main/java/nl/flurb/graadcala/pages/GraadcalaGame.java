/*
 * 2019 Flurb
 */
package nl.flurb.graadcala.pages;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;
import nl.flurb.graadcala.components.FirstPlayerRow;
import nl.flurb.graadcala.components.SecondPlayerRow;
import nl.flurb.graadcala.database.GameSetup;
import nl.flurb.graadcala.database.GameSetupRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@Route(value = "game", layout = GraadcalaHeader.class)
public class GraadcalaGame extends VerticalLayout implements BeforeEnterObserver {

    private FirstPlayerRow firstPlayerRow;
    private SecondPlayerRow secondPlayerRow;
    private GameSetupRepository gameSetupRepository;

    // TODO: Define somewhere else.
    private int numberOfSmallPits = 6;

    public GraadcalaGame(@Autowired FirstPlayerRow firstPlayerRow,
                         @Autowired SecondPlayerRow secondPlayerRow,
                         @Autowired GameSetupRepository gameSetupRepository) {
        LayoutUtils.initializeDefaultVerticalLayout(this);

        this.firstPlayerRow = firstPlayerRow;
        this.secondPlayerRow = secondPlayerRow;
        this.gameSetupRepository = gameSetupRepository;
    }

    private void addPlayerRows() {
        Optional<GameSetup> optionalGameSetup = gameSetupRepository.findById(1L);
        if (optionalGameSetup.isPresent()) {
            GameSetup setup = optionalGameSetup.get();
            numberOfSmallPits = setup.getNumberOfSmallPits();
        }

        firstPlayerRow.addBigPit();
        firstPlayerRow.addSmallPits(numberOfSmallPits);

        secondPlayerRow.addSmallPits(numberOfSmallPits);
        secondPlayerRow.addBigPit();

        add(firstPlayerRow);
        add(secondPlayerRow);
    }

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        addPlayerRows();
    }
}
