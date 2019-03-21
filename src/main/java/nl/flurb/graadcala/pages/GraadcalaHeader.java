package nl.flurb.graadcala.pages;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.RouterLayout;

@ParentLayout(MainLayout.class)
public class GraadcalaHeader extends VerticalLayout implements RouterLayout {

    public GraadcalaHeader() {
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        setWidthFull();

        add(new H1("Mancala"));
        add(new H5("Just play the game"));
    }
}
