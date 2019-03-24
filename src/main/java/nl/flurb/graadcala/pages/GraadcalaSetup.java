/*
 * 2019 Flurb
 */
package nl.flurb.graadcala.pages;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeLeaveEvent;
import com.vaadin.flow.router.BeforeLeaveObserver;
import com.vaadin.flow.router.Route;
import nl.flurb.graadcala.I18nLoader;
import nl.flurb.graadcala.database.GameSetupRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "", layout = GraadcalaHeader.class)
public class GraadcalaSetup extends VerticalLayout implements BeforeLeaveObserver {

    private ComboBox<Integer> numberOfSmallPits;
    private Button startGameButton;

    public GraadcalaSetup(@Autowired GameSetupRepository setupRepo) {
        LayoutUtils.initializeDefaultVerticalLayout(this);

        addGameExplain();
        addSmallPitsComboBox();
        addStartGameButton();
    }

    @Override
    public void beforeLeave(BeforeLeaveEvent event) {
        if (numberOfSmallPits.isEmpty()) {
            Notification.show("Not everything is set!");
        }
    }

    private void addGameExplain() {
        add(new H5(I18nLoader.getGameExplain()));
    }

    private void addSmallPitsComboBox() {
        numberOfSmallPits = new ComboBox<>("Number of small pits");
        numberOfSmallPits.setItems(4, 5, 6);

        add(numberOfSmallPits);
    }

    private void addStartGameButton() {
        startGameButton = new Button("Start Game");
        startGameButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        startGameButton.addClickListener(event -> startGameButton.getUI().ifPresent(ui -> ui.navigate("game")));

        add(startGameButton);
    }
}
