import java.util.Scanner;

public class Gui {

    private Scanner scan = new Scanner(System.in);

    public int showBaseMenu() {
        System.out.println("Wybier odpowiednią akcje:");
        System.out.println("1. Dodaj produkt");
        System.out.println("2. Odbierz paczkę");
        System.out.println("3. Zakończ");
        return Integer.parseInt(scan.nextLine());
    }

    public int showAddMenu(){
        System.out.println("Wybierz produkt do dodania");
        System.out.println("1. Dodaj buty");
        return Integer.parseInt(scan.nextLine());
    }

    public int showPhoneNumberMenu(){
        System.out.println("Podaj numer telefonu");
        return Integer.parseInt(scan.nextLine());
    }

    public void sayHello() {
        System.out.println("Witaj w systemie paczkomat 0.1");
    }

    public void noEmptyBox(){
        System.out.println("Dodanie produktu nie jest możliwe. Skrzynka jest już zajęta.");
    }

    public void wrongAction(){
        System.out.println("Wybrana akcja jest nie dostępna");
    }

    public void endAction(){
        System.out.println(">>>>>> Dziękujemy za skorzystanie z systemu paczki <<<<<<");
    }
}
