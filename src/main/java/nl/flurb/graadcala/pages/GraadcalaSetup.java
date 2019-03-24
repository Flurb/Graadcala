/*
 * 2019 Flurb
 */
package nl.flurb.graadcala.pages;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.H5;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import nl.flurb.graadcala.I18nLoader;
import nl.flurb.graadcala.database.GameSetup;
import nl.flurb.graadcala.database.GameSetupRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "", layout = GraadcalaHeader.class)
public class GraadcalaSetup extends VerticalLayout {

    private ComboBox<Integer> numberOfSmallPits;
    private Button startGameButton;

    private GameSetupRepository setupRepository;

    public GraadcalaSetup(@Autowired GameSetupRepository setupRepository) {
        LayoutUtils.initializeDefaultVerticalLayout(this);

        this.setupRepository = setupRepository;

        addGameExplain();
        addSmallPitsComboBox();
        addStartGameButton();
    }

    private void addGameExplain() {
        add(new H5(I18nLoader.getGameExplain()));
    }

    private void addSmallPitsComboBox() {
        numberOfSmallPits = new ComboBox<>("Number of small pits");
        numberOfSmallPits.setItems(4, 5, 6);
        numberOfSmallPits.setRequired(true);

        add(numberOfSmallPits);
    }

    private void addStartGameButton() {
        startGameButton = new Button("Start Game");
        startGameButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        startGameButton.addClickListener(event -> validateAndSave());

        add(startGameButton);
    }

    private void saveSetup() {
        GameSetup setup = new GameSetup(numberOfSmallPits.getValue());
        setupRepository.save(setup);
    }

    private void validateAndSave() {
        // TODO: Do via binder.
        if (numberOfSmallPits.isEmpty()) {
            numberOfSmallPits.setInvalid(true);
        } else {
            saveSetup();
            startGameButton.getUI().ifPresent(ui -> ui.navigate("game"));
        }
    }
}
