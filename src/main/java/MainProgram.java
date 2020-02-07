public class MainProgram {
    public static void main(String[] args) {


        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat = new Cat();

        System.out.println("");


        home.makeAllSounds();
        home.adoptPet(dog1);

        System.out.println("");

        home.makeAllSounds();

        System.out.println("");


        home.adoptPet(cat);
        home.makeAllSounds();

        System.out.println("");


        home.adoptPet(dog2);
        home.makeAllSounds();




    }
}