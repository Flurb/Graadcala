/*
 * 2019 Flurb
 */
package nl.flurb.graadcala.database;

import com.vaadin.flow.spring.annotation.SpringComponent;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringComponent
public interface GameSetupRepository extends JpaRepository<GameSetup, Long> {
}
