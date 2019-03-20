package nl.flurb.graadcala;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import nl.flurb.graadcala.ui.FirstPlayerRow;
import nl.flurb.graadcala.ui.SecondPlayerRow;
import org.springframework.beans.factory.annotation.Autowired;


@Route("")
public class GraadcalaUI extends VerticalLayout {

    private H1 headerLabel;

    public GraadcalaUI(@Autowired FirstPlayerRow firstPlayerRow,
                       @Autowired SecondPlayerRow secondPlayerRow) {

        setDefaultHorizontalComponentAlignment(Alignment.CENTER);

        addHeader();

        add(firstPlayerRow);
        add(secondPlayerRow);
    }

    private void addHeader() {
        headerLabel = new H1("Mancala");
        add(headerLabel);
    }
}
