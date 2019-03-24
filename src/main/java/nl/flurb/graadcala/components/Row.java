/*
 * 2019 Flurb
 */
package nl.flurb.graadcala.components;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextAreaVariant;
import java.util.stream.IntStream;

abstract class Row extends HorizontalLayout {

    Row() {
    }

    public void addSmallPits(int numberOfSmallPits) {
        HorizontalLayout smallPitRow = new HorizontalLayout();

        IntStream.range(0, numberOfSmallPits).forEach(index ->
                smallPitRow.add(new SmallPit()));

        add(smallPitRow);
        expand(smallPitRow);
    }

    void setVerticalAlignmentSmallPits(Alignment alignment) {
        setDefaultVerticalComponentAlignment(alignment);
    }

    public void addBigPit() {
        BigPit bigPit = new BigPit();
        bigPit.addThemeVariants(TextAreaVariant.LUMO_ALIGN_CENTER);
        add(bigPit);
    }
}
