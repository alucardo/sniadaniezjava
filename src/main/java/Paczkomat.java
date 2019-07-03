import java.util.Scanner;

public class Paczkomat {

    private Scanner scan = new Scanner(System.in);
    private String name = "paczkomat1";
    private Product product = new NullProduct();


    public void sayHello() {
        System.out.println("Witaj w systemie paczkomat 0.1");
    }

    public int showBaseMenu() {
        System.out.println("Wybier odpowiednią akcje:");
        System.out.println("1. Dodaj produkt");
        System.out.println("2. Odbierz paczkę");
        System.out.println("3. Zakończ");
        return Integer.parseInt(scan.nextLine());
    }

    public void addProduct() {
        System.out.println("Wybierz produkt do dodania");
        System.out.println("1. Dodaj buty");
        int selectedOption = Integer.parseInt(scan.nextLine());
        if(selectedOption ==  1){
            if(product.isNull()){
                product = new Shoe();
            }else {
                System.out.println("Produkt już istnieje");
            }
        } else {
            System.out.println("Nie udało się dodać produktu do paczkomatu");
        }

    }

    public boolean productInTheBox(){
        return true;
    }

}
