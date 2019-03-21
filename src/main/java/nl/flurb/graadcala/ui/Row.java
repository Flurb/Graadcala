package nl.flurb.graadcala.ui;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextAreaVariant;
import nl.flurb.graadcala.ui.components.BigPit;
import nl.flurb.graadcala.ui.components.SmallPit;

abstract class Row extends HorizontalLayout {

    Row() {
        expand();
    }

    void setVerticalAlignmentSmallPits(Alignment alignment) {
        setDefaultVerticalComponentAlignment(alignment);
    }

    void addBigPit() {
        BigPit bigPit = new BigPit();
        bigPit.addThemeVariants(TextAreaVariant.LUMO_ALIGN_CENTER);
        add(bigPit);
    }

    void addSmallPits() {
        HorizontalLayout smallPitRow = new HorizontalLayout();

        smallPitRow.add(new SmallPit());
        smallPitRow.add(new SmallPit());
        smallPitRow.add(new SmallPit());
        smallPitRow.add(new SmallPit());
        smallPitRow.add(new SmallPit());
        smallPitRow.add(new SmallPit());

        add(smallPitRow);
        expand(smallPitRow);
    }
}
