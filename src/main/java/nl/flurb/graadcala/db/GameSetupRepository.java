package nl.flurb.graadcala.db;

import com.vaadin.flow.spring.annotation.SpringComponent;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringComponent
public interface GameSetupRepository extends JpaRepository<GameSetup, Long> {
}
