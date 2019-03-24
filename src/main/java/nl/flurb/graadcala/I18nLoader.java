/*
 * 2019 Flurb
 */
package nl.flurb.graadcala;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nLoader {
    private static final ResourceBundle I18N_BUNDLE;

    static {
        I18N_BUNDLE = ResourceBundle.getBundle("i18n.i18n", Locale.getDefault());
    }

    public static String getGameTitle() {
        return I18N_BUNDLE.getString("gameTitle");
    }

    public static String getGameExplain() {
        return I18N_BUNDLE.getString("gameExplain");
    }
}
