import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(5, 10, "The Corries","The Corries Live from Scotland Volume 1");
    }

    @Test
    public void sheetMusicHasBuyPrice(){
        assertEquals(5, sheetMusic.getBuyPrice());
    }

    @Test
    public void sheetMusicHasSellPrice(){
        assertEquals(10, sheetMusic.getSellPrice());
    }

    @Test
    public void sheetMusicHasArtist(){
        assertEquals("The Corries", sheetMusic.getArtist());
    }

    @Test
    public void sheetMusicHasAlbum(){
        assertEquals("The Corries Live from Scotland Volume 1", sheetMusic.getAlbum());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(5, sheetMusic.calculateMarkup());
    }


}
