import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private final ArrayList<String> listaScherzi;

    public JokeManager() {
        this.listaScherzi = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.listaScherzi.add(joke);
    }

    public String drawJoke() {
        if (this.listaScherzi.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(this.listaScherzi.size());
            return this.listaScherzi.get(index);
        }

    }

    public void printJokes() {
        for (String string : this.listaScherzi) {
            System.out.println(string);
        }
    }

}
