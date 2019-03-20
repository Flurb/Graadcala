package nl.flurb.graadcala.ui;

import com.vaadin.flow.spring.annotation.SpringComponent;

@SpringComponent
public class FirstPlayerRow extends Row {

    public FirstPlayerRow() {
        addBigPit();
        addSmallPits();
    }
}
