package pl.przemyslawolesinski.products;

public class Product {

    private String name = "Product";
    private int price = 10;
    protected int vat;

    public String getName() {
        System.out.println("This is product");
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = (int)(price * 100);
    }

    public void getPrice(){
        System.out.println(price);
    }

    public boolean isNull() {
        return false;
    }
}
