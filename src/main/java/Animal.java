public class Animal {


    private  String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sounds(){

        System.out.println(this.name+" sound");
    }

    public void eat(){

        System.out.println(this.name+" eats" );
    }


}
