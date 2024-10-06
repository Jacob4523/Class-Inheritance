public class Animal {
    public int age;
    public String gender;

    public static void isMammal() {
        System.out.println("This is the public method isMammal() from class Animal");
    }

    public static void mate() {
        System.out.println("This is the public method mate() from class Animal");
    }

    @SuppressWarnings("unused")
    public static void main(String [] args) {
        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();
        isMammal();
        mate();
        Zebra.run();
    }
}
