import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(5, 10, 1, "steel");
    }

    @Test
    public void stringsHasBuyPrice(){
        assertEquals(5, guitarStrings.getBuyPrice());
    }

    @Test
    public void stringHasSellPrice(){
        assertEquals(10, guitarStrings.getSellPrice());
    }

    @Test
    public void stringHasGauge(){
        assertEquals(1, guitarStrings.getGauge());
    }


    @Test
    public void stringHAsMaterial(){
        assertEquals("steel", guitarStrings.getMaterial());
    }


    @Test
    public void canCalculateMarkUp(){
        assertEquals(5, guitarStrings.calculateMarkup());
    }

}
