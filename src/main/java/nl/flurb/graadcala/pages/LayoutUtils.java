/*
 * 2019 Flurb
 */
package nl.flurb.graadcala.pages;

import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

/**
 * Utils class for layout classes
 */
class LayoutUtils {

    private LayoutUtils() {}

    /**
     * Initializing a VerticalLayout component with default settings.
     *
     * @param layout The layout to initialize.
     */
    static void initializeDefaultVerticalLayout(VerticalLayout layout) {
        layout.setDefaultHorizontalComponentAlignment(FlexComponent.Alignment.CENTER);
        layout.setWidthFull();
    }
}
