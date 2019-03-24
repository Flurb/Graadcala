/*
 * 2019 Flurb
 */
package nl.flurb.graadcala.pages;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import nl.flurb.graadcala.ui.FirstPlayerRow;
import nl.flurb.graadcala.ui.SecondPlayerRow;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "game", layout = GraadcalaHeader.class)
public class GraadcalaGame extends VerticalLayout {

    private FirstPlayerRow firstPlayerRow;
    private SecondPlayerRow secondPlayerRow;

    public GraadcalaGame(@Autowired FirstPlayerRow firstPlayerRow,
                         @Autowired SecondPlayerRow secondPlayerRow) {
        LayoutUtils.initializeDefaultVerticalLayout(this);

        this.firstPlayerRow = firstPlayerRow;
        this.secondPlayerRow = secondPlayerRow;

        addPlayerRows();
    }

    private void addPlayerRows() {
        add(firstPlayerRow);
        add(secondPlayerRow);
    }
}
