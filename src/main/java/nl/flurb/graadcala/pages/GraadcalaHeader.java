/*
 * 2019 Flurb
 */
package nl.flurb.graadcala.pages;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLayout;
import nl.flurb.graadcala.I18nLoader;

public class GraadcalaHeader extends VerticalLayout implements RouterLayout {

    public GraadcalaHeader() {
        LayoutUtils.initializeDefaultVerticalLayout(this);

        addHeader();
    }

    private void addHeader() {
        add(new H1(I18nLoader.getGameTitle()));
    }
}
