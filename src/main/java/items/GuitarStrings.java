package items;



public class GuitarStrings extends item{

    private int gauge;
    private String material;


    public GuitarStrings(int buyPrice, int sellPrice, int gauge, String material) {
        super(buyPrice, sellPrice);
        this.gauge = gauge;
        this.material = material;
    }

    public int getGauge() {
        return gauge;
    }

    public void setGauge(int gauge) {
        this.gauge = gauge;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
