import behaviours.ISell;
import instruments.Guitar;

import java.util.ArrayList;

public class Shop {

    ISell iSell;

    private ArrayList<ISell>stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }


    public int stockCount() {
        return stock.size();
    }

    public void addStock(ISell item) {
        stock.add(item);
    }

    public void removeStock(ISell item) {
        stock.remove(item);
    }

    public int getTotalMarkup() {
        int total = 0;
        for(ISell iSell: stock) {
            total += iSell.calculateMarkup();
        }
        return total;
    }
}
