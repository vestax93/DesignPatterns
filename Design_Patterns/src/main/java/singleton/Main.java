package singleton;

public class Main {
    public static void main(String[] args) {
        Hashcode h1 = Hashcode.getInstance();
        System.out.println(h1);
        Hashcode h2 = Hashcode.getInstance();
        System.out.println(h2);
    }
}
