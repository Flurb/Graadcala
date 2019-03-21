package nl.flurb.graadcala.pages;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import nl.flurb.graadcala.ui.FirstPlayerRow;
import nl.flurb.graadcala.ui.SecondPlayerRow;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "game", layout = GraadcalaHeader.class)
public class GraadcalaGame extends VerticalLayout {

    public GraadcalaGame(@Autowired FirstPlayerRow firstPlayerRow,
                         @Autowired SecondPlayerRow secondPlayerRow) {

        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        setWidthFull();

        add(firstPlayerRow);
        add(secondPlayerRow);
    }
}
