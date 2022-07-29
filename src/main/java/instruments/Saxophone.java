package instruments;

import Enums.InstrumentType;
import Enums.SaxophoneSize;

public class Saxophone extends Instrument{

    private int noOfValves;
    SaxophoneSize size;

    public Saxophone(String material, String colour, int buyPrice, int sellPrice, InstrumentType type, int noOfValves, SaxophoneSize size) {
        super(material, colour, buyPrice, sellPrice, type);
        this.noOfValves = noOfValves;
        this.size = size;
    }


    public int getNoOfValves() {
        return noOfValves;
    }

    public void setNoOfValves(int noOfValves) {
        this.noOfValves = noOfValves;
    }

    public SaxophoneSize getSize() {
        return size;
    }

    public void setSize(SaxophoneSize size) {
        this.size = size;
    }

    public String play() {
        return "toot toot";
    }
}
