public class App {


    public static void main(String[] args){

        boolean appStarted = true;

        Paczkomat paczkomat = new Paczkomat();
        int selectedMenuEl = 100;
        paczkomat.sayHello();

        while (appStarted ) {
            selectedMenuEl = paczkomat.showBaseMenu();
            switch (selectedMenuEl) {
                case 1:
                    paczkomat.addProduct();
                    break;
                case 2:
                    System.out.println("Podaj numer telefonu");
                    break;
                case 3:
                    System.out.println(">>>>>> Dziękujemy za skorzystanie z systemu paczki <<<<<<");
                    appStarted = false;
                    break;
                default:
                    System.out.println("Wybrana akcja jest nie dostępna");
            }
        }

//        3. wyjmij produkt
//        4. sprawdz czy jest juz wyjety

    }

}
