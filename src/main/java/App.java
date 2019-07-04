public class App {


    public static void main(String[] args){

        boolean appStarted = true;

        Paczkomat paczkomat = new Paczkomat();
        int selectedMenuEl = 0;
        paczkomat.getGui().sayHello();

        while (appStarted) {
            selectedMenuEl = paczkomat.getGui().showBaseMenu();
            switch (selectedMenuEl) {
                case 1:
                    paczkomat.addProduct();
                    break;
                case 2:
                    paczkomat.getGui().showPhoneNumberMenu();
                    break;
                case 3:
                    paczkomat.getGui().endAction();
                    appStarted = false;
                    break;
                default:
                    paczkomat.getGui().wrongAction();
            }
        }
    }

}
