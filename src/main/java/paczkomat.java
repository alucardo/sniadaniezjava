public class paczkomat {

    public String name = "paczkomat1";

    public void getName() {
        System.out.println("Jestem: " + name);
    }

    public void setAndGetName(String name) {
//        name
//        this.name => paczkomat1.name
        this.name = name;
        System.out.println("Jestem: " + this.name);
    }

}
