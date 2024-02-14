package factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cakeType = sc.nextLine();
        double diameter = Double.parseDouble(sc.nextLine());
        double price =  Double.parseDouble(sc.nextLine());
        int pieces =  Integer.parseInt(sc.nextLine());

        CakeFactory cakeFactory = new CakeFactory();
        PastryShop pastryShop = new PastryShop(cakeFactory);

        pastryShop.orderCake(cakeType, diameter, price, pieces);
    }
}
