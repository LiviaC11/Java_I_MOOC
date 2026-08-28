import java.util.ArrayList;

public class Stack {
    ArrayList<String> lista = new ArrayList<>();

    public boolean isEmpty() {
        if (lista.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String value) {

        lista.add(value);

    }

    public ArrayList<String> values() {
        return lista;
    }

    public String take() {
        int lSize = lista.size();
        String lastS = lista.get(lSize - 1);
        lista.remove(lSize - 1);
        return lastS;
    }
}
