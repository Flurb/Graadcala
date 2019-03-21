package nl.flurb.graadcala.ui;

import com.vaadin.flow.spring.annotation.SpringComponent;

@SpringComponent
public class SecondPlayerRow extends Row {

    public SecondPlayerRow() {
        addSmallPits();
        addBigPit();

        setVerticalAlignmentSmallPits(Alignment.END);
    }
}
