import Enums.GuitarVariant;
import Enums.InstrumentType;
import behaviours.ISell;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Guitar guitar2;

    ISell iSell;

    private ArrayList<ISell> stock;

    @Before public void before(){
        shop = new Shop();
        guitar = new Guitar("wood", "red", 100, 150, InstrumentType.STRING, 6, GuitarVariant.ELECTRIC);
        guitar2 = new Guitar("wood", "red", 100, 150, InstrumentType.STRING, 6, GuitarVariant.ELECTRIC);
    }

    @Test
    public void shopStockStartsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddToStock(){
        shop.addStock(guitar);
        shop.addStock(guitar);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(guitar);
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canGetTotalMarkUp(){
        shop.addStock(guitar);
        shop.addStock(guitar2);
        assertEquals(100, shop.getTotalMarkup());
    }
}
