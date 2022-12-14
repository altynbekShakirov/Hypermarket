package markets;

import products.Products;

import java.util.ArrayList;
import java.util.List;

public interface Methods {

    void pokupka(ArrayList<Products>productsArrayList,ArrayList<Products>products,ArrayList<Integer>price,Person person,Market market );
    void pricePerson(Person person);


    void vseProducts(ArrayList<Products>products);
    void meninAkcham(Person person);
    void  marketMoney(Market market);







}
