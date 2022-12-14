package markets;

import products.Products;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.*;

public abstract class Market implements Methods {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Double> markets = new ArrayList<>();
    private String nameMarket;
    private int priceMarket;

    public Market(String nameMarket, int priceMarket) {
        this.nameMarket = nameMarket;
        this.priceMarket = priceMarket;
    }

    public Market() {

    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Market.scanner = scanner;
    }

    public int getPriceMarket() {
        return priceMarket;
    }

    public void setPriceMarket(int priceMarket) {
        this.priceMarket = priceMarket;
    }

    public String getNameMarket() {
        return nameMarket;
    }

    public void setNameMarket(String nameMarket) {
        this.nameMarket = nameMarket;
    }

    @Override
    public String toString() {
        return
                "//" + nameMarket + "||" + priceMarket;
    }

    @Override
    public void pokupka(ArrayList<Products> productsArrayList, ArrayList<Products> products, ArrayList<Integer> price, Person person, Market market) {
        while (true) {
            System.out.println(" EMNE ALASYZ ? ");
            String pocupka = scanner.next();

            for (Products product : products) {


                if (pocupka.equalsIgnoreCase(product.getName())) {

                    System.out.println("KANCHOONU ALASYZ:");
                    int daana = scanner.nextInt();
                    daana = daana * product.getPrice();
                    price.add(daana);
                    productsArrayList.add(product);


                }

            }
            System.out.println("        ");
            System.out.println("dagy alasyzby:(yes/no)");
            String yesNo = scanner.next();
            if (yesNo.trim().equalsIgnoreCase("NO")) {
                System.out.println("u vas est " + market.nameMarket + " kartachka (yes/no)");
                String skidk = scanner.next();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~Check~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Ким алды: " + person.getName());
                System.out.println("Кайсыл маркеттен алды: " + market.nameMarket);
                System.out.print("Список товаров");
                productsArrayList.forEach(System.out::println);
                double counter = 0;
                System.out.print("Общая стоимость товаров:");
                for (int i = 0; i < price.size(); i++) {
                    double num = counter += price.get(i);
                    System.out.println(num + "som");
                    double v = person.getPricePerson() - num;
                    double c = market.getPriceMarket() + num;


                }
                if (skidk.equalsIgnoreCase("yes")) {
                    int skidka = 4;
                    System.out.println("");
                    double num = Math.abs(counter * skidka / 100 - counter);
                    System.out.println("Общая стоимость после скидки:" + num + "som");
                    double result = person.getPricePerson() - num;
                    double kassa = market.getPriceMarket() + num;

                }

                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Спасибо за покупку!");


                break;
            }


        }
    }

    @Override
    public void pricePerson(Person person) {
        System.out.println(person.getPricePerson());

    }

    @Override
    public void vseProducts(ArrayList<Products> products) {
        products.forEach(System.out::println);

    }

    @Override
    public void meninAkcham(Person person) {
        System.out.println("Menin Akcham: " + person.getPricePerson());

    }

    @Override
    public void marketMoney(Market market) {

        System.out.println("Market price: " + market.getPriceMarket());
    }
}

