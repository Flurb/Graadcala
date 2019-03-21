package nl.flurb.graadcala.pages;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.BeforeLeaveEvent;
import com.vaadin.flow.router.BeforeLeaveObserver;
import com.vaadin.flow.router.Route;
import nl.flurb.graadcala.db.GameSetupRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "", layout = GraadcalaHeader.class)
public class GraadcalaSetup extends VerticalLayout implements BeforeLeaveObserver {

    private ComboBox<Integer> numberOfSmallPits;
    private TextField playerName;

    private Button startGameButton;

    @Autowired
    private GameSetupRepository repo;

    public GraadcalaSetup() {
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        setWidthFull();

        initializeSmallPitsComboBox();
        initializePlayerNameTextfield();
        initializeStartGameButton();
    }

    @Override
    public void beforeLeave(BeforeLeaveEvent event) {
        if (numberOfSmallPits.isEmpty() ||
            playerName.isEmpty()) {
            Notification.show("Not everything is set!");
        }
    }

    private void initializePlayerNameTextfield() {
        playerName = new TextField("Player name");

        add(playerName);
    }

    private void initializeSmallPitsComboBox() {
        numberOfSmallPits = new ComboBox<>("Number of small pits");
        numberOfSmallPits.setItems(4, 5, 6);

        add(numberOfSmallPits);
    }

    private void initializeStartGameButton() {
        startGameButton = new Button("Start Game");
        startGameButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        startGameButton.addClickListener(event -> startGameButton.getUI().ifPresent(ui -> ui.navigate("game")));

        add(startGameButton);
    }
}
