package factory;

public class CakeFactory { //cakeFactory se bavi iskljucivo kreiranjem objekata //podklasa
    public Cake createCake(String cakeType, double diameter, double price, int pieces){ //naziv metode koja odredjuje i kreira odgovarajuci objekat bi trebalo dase zove createNazivNadklase koju svi dele
        Cake cake = null;
        switch (cakeType){
            case "Buscuit":
                cake = new BiscuitCake(diameter,price,pieces);
                break;
            case "White":
                cake = new Whitecake(diameter,price,pieces);
                break;
            case "Chocolate":
                cake = new ChocolateCake(diameter, price, pieces);
                break;
            case "Spinach":
                cake = new SpinachCake(diameter, price, pieces);
                break;
        }

        return cake;
    }
}
