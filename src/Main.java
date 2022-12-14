import markets.*;
import products.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Products> products = new ArrayList<>();
    private static ArrayList<Products> productsArrayList = new ArrayList<>();
    private static ArrayList<Integer> price = new ArrayList<>();
    public  static  Globus globus = new Globus("GLOBUS", 2000000);
    public  static  Frunze frunze = new Frunze("FRUNZE", 1500000);
    public  static  Narodnyi narodnyi = new Narodnyi("NARODNYI", 1000000);

    public static void main(String[] args) {
        products.add(new Beverages("Coca- cola", 75, 20));
        products.add(new Beverages("Fanta-cola", 75, 23));
        products.add(new Beverages("Sprite", 75, 23));
        products.add(new Beverages("Mirinda", 75, 23));
        products.add(new Beverages("Pepsi", 80, 56));
        products.add(new Beverages("Sultan-tea", 35, 56));
        products.add(new Beverages("Maxi", 65, 43));
        products.add(new Beverages("Lets-go", 45, 76));
        products.add(new Beverages("Chupa-Chups ", 125, 45));
        products.add(new Beverages("Flesh", 100, 45));
        products.add(new Beverages("Adrenaline", 150, 45));
        products.add(new Dairy("sut", 65, 45));
        products.add(new Dairy("yogurt", 45, 45));
        products.add(new Dairy("byshtak", 250, 45));
        products.add(new Dairy("tvorok", 200, 23));
        products.add(new Dairy("may", 100, 34));
        products.add(new Dairy("syr", 200, 20));
        products.add(new Fruit("malina", 550, 23));
        products.add(new Fruit("anans", 300, 43));
        products.add(new Fruit("banan", 145, 34));
        products.add(new Fruit("alma", 65, 34));
        products.add(new Fruit("mandorin", 350, 23));
        products.add(new Fruit("Oruk", 85, 23));
        products.add(new Fruit("shabdolu", 105, 24));
        products.add(new MeatProducts("ui et",600,50));
        products.add(new MeatProducts("Kolbosa",350,40));
        products.add(new MeatProducts("koi et",600,50));
        products.add(new MeatProducts("koi et farj",550,50));
        products.add(new MeatProducts("ui et farj",600,50));
        products.add(new MeatProducts("goviadina",700,50));
        products.add(new MeatProducts("ryba",300,50));
        products.add(new MeatProducts("kuritsa",600,50));
        products.add(new MeatProducts("chuchuk",500,50));
        products.add(new MeatProducts("sala",700,50));


        comands();

    }


    public static void comands() {
        System.out.println("Salamatsyzby atynyz:");
        String namePerson = scanner.nextLine();

        while (true) {

            Person person = new Person(namePerson, 5000);
            System.out.println("""
                    1.GLOBUS
                    2.FRUNZE
                    3.NARODNYI
                    4.MENIN AKCHAM
                    5.Marketerdin akchasy
                    6.BAARDYK TAVARLAR
                    7.ATYNA KARAP IZDOO
                 
                    
                     """);
            int market = scanner.nextInt();
            Market market1 = new Frunze();

            switch (market) {
                case 1:

                    System.out.println("ДОБРО ПОЖАЛОВАТЬ B " + globus.getNameMarket());
                    chevoVyHotite();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    globus.pokupka(productsArrayList, products, price, person, globus);


                    break;
                case 2:


                    System.out.println("ДОБРО ПОЖАЛОВАТЬ B " + frunze.getNameMarket());
                    chevoVyHotite();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    frunze.pokupka(productsArrayList, products, price, person, frunze);


                    break;
                case 3:


                    System.out.println("ДОБРО ПОЖАЛОВАТЬ B " + narodnyi.getNameMarket());
                    chevoVyHotite();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    narodnyi.pokupka(productsArrayList, products, price, person, narodnyi);

                    break;
                case 4:
                    System.out.println("");
                    market1.meninAkcham(person);
                    break;
                case 5:
                    market1.marketMoney(frunze);
                    market1.marketMoney(globus);
                    market1.marketMoney(narodnyi);
                    break;
                case 6:
                    System.out.println("BAARDYK TAVARLAR");
                    products.forEach(System.out::println);
                    break;
                case 7:
                    String izdoo = scanner.nextLine();
                    for (Products p:products) {
                        if (izdoo.equals(p.getName())){
                            System.out.println(p);
                        }

                    }
                    break;
                case 8:
                    String ochuru = scanner.nextLine();
                    int counter=0;
                    for (Products p:products) {
                        counter++;

                        if (ochuru.equals(p.getName())){
                            products.remove(counter);
                            break;
                        }
                    }
            }
                    break;
        }
    }

    public static void chevoVyHotite() {
        while (true) {
            System.out.println("""
                    1.НОПИТКИ
                    2.МОЛОЧНЫЕ
                    3.ФРУКТЫ
                    4.МЯСНЫЕ ПРОДУКТЫ
                                    
                    """);
            int num = scanner.nextInt();

            if (num == 1) {
                System.out.println("НОПИТКИ");

                for (Products produkts : products) {
                    if (produkts instanceof Beverages) {
                        System.out.println(produkts);

                    }

                }
                break;
            }


            if (num == 2) {
                System.out.println("МОЛОЧНЫЕ");

                for (Products produkts : products) {
                    if (produkts instanceof Dairy) {
                        System.out.println(produkts);

                    }

                }
                break;

            }
            if (num == 3) {
                System.out.println("ФРУКТЫ");

                for (Products produkts : products) {
                    if (produkts instanceof Fruit) {
                        System.out.println(produkts);

                    }

                }
                break;

            }
            if (num == 4) {
                System.out.println("МЯСНЫЕ ПРОДУКТЫ");
                for (Products produkts : products) {
                    if (produkts instanceof MeatProducts) {
                        System.out.println(produkts);

                    }

                }

                break;
            }


        }
    }

}
