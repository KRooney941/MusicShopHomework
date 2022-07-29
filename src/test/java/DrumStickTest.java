import items.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumSticks drumStick;

    @Before
    public void before(){
        drumStick = new DrumSticks(5, 10, "wood", "brown");
    }

    @Test
    public void drumStickHasBuyPrice(){
        assertEquals(5, drumStick.getBuyPrice());
    }

    @Test
    public void drumStickHasSellPrice(){
        assertEquals(10, drumStick.getSellPrice());
    }

    @Test
    public void drumStickHasMaterial(){
        assertEquals("wood", drumStick.getMaterial());
    }

    @Test
    public void drumStickHasColour(){
        assertEquals("brown", drumStick.getColour());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(5, drumStick.calculateMarkup());
    }




}
