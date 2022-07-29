import Enums.GuitarVariant;
import Enums.InstrumentType;
import Enums.PianoVariant;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;


    @Before
    public void before(){
        piano = new Piano("wood", "black", 100, 200, InstrumentType.STRING, 30, PianoVariant.GRAND);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(200, piano.getSellPrice());
    }

    @Test
    public void hasPianoVariant(){
        assertEquals(PianoVariant.GRAND, piano.getVariant());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(100, piano.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("ting ting", piano.play());
    }

    @Test
    public void noOfKeys(){
        assertEquals(30, piano.getNoOfKeys());
    }



}
