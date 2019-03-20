package nl.flurb.graadcala.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

abstract class Row extends HorizontalLayout {

    Row() {

    }

    void addBigPit() {
        TextField bigPit = new TextField();
        bigPit.setReadOnly(true);

        add(bigPit);
    }

    void addSmallPits() {
        add(new Button());
        add(new Button());
        add(new Button());
        add(new Button());
        add(new Button());
        add(new Button());
    }
}
