import Enums.GuitarVariant;
import Enums.InstrumentType;
import Enums.SaxophoneSize;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone("brass", "gold", 200, 300, InstrumentType.BRASS, 20, SaxophoneSize.LARGE);
    }

    @Test
    public void hasMaterial(){
        assertEquals("brass", saxophone.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("gold", saxophone.getColour());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(300, saxophone.getSellPrice());
    }

    @Test
    public void hasGuitarVariant(){
        assertEquals(SaxophoneSize.LARGE, saxophone.getSize());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(100, saxophone.calculateMarkup());
    }

    @Test
    public void hasType(){
        assertEquals(SaxophoneSize.LARGE, saxophone.getSize());
    }

    @Test
    public void canPlay(){
        assertEquals("toot toot", saxophone.play());
    }



}
