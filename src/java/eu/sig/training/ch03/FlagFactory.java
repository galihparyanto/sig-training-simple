package eu.sig.training.ch03;

import com.sun.beans.editors.ColorEditor;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static eu.sig.training.ch03.Nationality.*;

public class FlagFactory {

    private static Map<Nationality, List<Color>> flags = new HashMap<Nationality, List<Color>>();

    static {
        flags.put(DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        flags.put(GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        flags.put(BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        flags.put(FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        flags.put(ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        flags.put(ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
        flags.put(IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
        flags.put(HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
        flags.put(BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));
        flags.put(RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
    }
    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result = flags.get(nationality);
        return result != null ? result : Arrays.asList(Color.GRAY);
    }
    // end::getFlag[]

}