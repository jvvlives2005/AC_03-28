package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/28/15.
 */
import sun.invoke.empty.Empty;

import java.util.ArrayList;

public class Kennel {
    ArrayList<Dog>kennel;

    public Kennel (){
        this. kennel = new ArrayList<Dog>();
    }

    public void AddDog(Dog input) {
        this.kennel.add(input);                 //it's optional in order to prevent Java from being confused- meaning if my "input" was the same name as "kennel"
    }

    public int numOfDogs(){
        return kennel.size();
    }

    public boolean hasDogs() {
        boolean adopt = kennel.isEmpty();
        if (adopt == true) {
            return false;
        }
        else
            return true;
    }

    public void shutdownKennel(){
        kennel.clear();
    }

    public Dog removeDog(int index){
        Dog puppy = kennel.get(index);
        kennel.remove(index);
        return puppy;
        //or return kennel.remove(index)
    }

    public Dog getDog(int index1){
        Dog playingPup = kennel.get(index1);
        return playingPup;
        //return kennel.get(index1);
    }

    /*public Dog exchangeDog(int index2, Dog substitute) {
        Dog placeholder = getDog(index2);
        return( Dog subs);
    }*/

}
