package factory;

public class PastryShop {
    CakeFactory factory;

    public PastryShop(CakeFactory factory) {
        this.factory = factory;
    }

    public Cake orderCake(String cakeType, double diameter, double price, int pieces){
        Cake cake = factory.createCake(cakeType, diameter, price, pieces);
        cake.prepare();
        cake.bake();
        cake.box();
        return cake;

    }
}
