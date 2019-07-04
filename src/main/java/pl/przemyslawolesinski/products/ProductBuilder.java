package pl.przemyslawolesinski.products;

public class ProductBuilder {

    public static Product build(int product_type_id){
        Product new_product;
        switch (product_type_id) {
            case 1:
                new_product = new Shoe();
                break;
            default:
                new_product = new NullProduct();
        }
        return new_product;
    }

}
