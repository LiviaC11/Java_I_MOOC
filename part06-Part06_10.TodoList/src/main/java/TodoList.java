import java.util.ArrayList;

public class TodoList {
    private final ArrayList<String> lista;

    public TodoList() {
        this.lista = new ArrayList<>();
    }

    public void add(String task) {
        this.lista.add(task);
    }

    public void print() {
        for (int i = 0; i < this.lista.size(); i++) {
            System.out.println((i + 1) + ": " + this.lista.get(i));
        }
    }

    public void remove(int number) {
        if ((number - 1) >= 0 && number < this.lista.size()) {
            this.lista.remove(number - 1);
        }
    }
}
