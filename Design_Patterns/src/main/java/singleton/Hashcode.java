package singleton;

public class Hashcode {
    private String point;
    private static Hashcode INSTANCE; //instanca je static

    private Hashcode() { //konstruktor je private
        this.point = Integer.toString(hashCode());
    }

    public static Hashcode getInstance(){ //naziv koji implicitno govori da je u pitanju Singleton pattern
        if(INSTANCE == null){ //ako ne postoji inastanca (prvi poziv) onda se instancira
            INSTANCE = new Hashcode();
        }
        return INSTANCE; //vracamo instancu
    }
}
