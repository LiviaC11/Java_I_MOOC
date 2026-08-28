import java.util.ArrayList;

public class ListaOsservati {
    public final ArrayList<Bird> listaUccelli;

    public ListaOsservati() {
        this.listaUccelli = new ArrayList<>();
    }

    public void add(Bird bird) {
        listaUccelli.add(bird);
    }

    public void printAll() {
        for (Bird bird : listaUccelli) {
            System.out.println(bird);
        }
    }

    public void printByName(String name) {
        boolean trovato = false;
        for (Bird bird : listaUccelli) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                trovato = true;
            }

        }
        if (!trovato) {
            System.out.println("No bird found");
        }

    }
}
