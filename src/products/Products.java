package products;

public abstract class Products {
    private String name;
    private int price;
    private int daana;

    public Products(String name, int price, int daana) {
        this.name = name;
        this.price = price;
        this.daana = daana;
    }

    public Products() {

    }


    public int getDaana() {
        return daana;
    }

    public void setDaana(int daana) {
        this.daana = daana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "//"+name + "||"+ price +"som||"+daana+"\n"
                ;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }




}
