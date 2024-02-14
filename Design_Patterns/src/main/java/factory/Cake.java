package factory;

public abstract class Cake implements CakeInt{
    public double diameter;
    public double price; //cena je po paretu torte
    public int pieces; //koliko parcica nam treba

    public Cake(double diameter, double price, int pieces) {
        this.diameter = diameter;
        this.price = price;
        this.pieces = pieces;
    }

    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void box() {

    }
}
