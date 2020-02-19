import java.util.ArrayList;
import java.util.List;


public class Home {


    List<Animal> animal = new ArrayList<>();



   public void  adoptPet(Animal name)  {

          animal.add(name);
   }

   public void makeAllSounds(){

       for(Animal a: animal){
           a.sounds();
       }



   }

   }


