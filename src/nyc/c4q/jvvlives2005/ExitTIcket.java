package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/28/15.
 */
import java.util.ArrayList;
import java.util.Iterator;

public class ExitTIcket{
    public static void main(String[] args) {
        ArrayList<String> games = new ArrayList<String>();

        games.add("Monopoly");
        games.add("Risk");
        games.add("Hungry Hippos");
        games.add("Checkers");

        Iterator<String> iterate = games.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

        System.out.println(games.get(0));
    }

}
