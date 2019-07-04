import pl.przemyslawolesinski.products.Product;

public class ProductBox {

    private int phoneNumber;
    private int code;
    private Product product;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getCode() {
        return code;
    }

    public Product getProduct() {
        return product;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isEmpty() {
        return product.isNull();
    }

}
