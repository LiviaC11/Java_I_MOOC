import java.util.ArrayList;

public class ElencoVoti {
    private final ArrayList<Voto> listaVoti;

    public ElencoVoti() {
        listaVoti = new ArrayList<>();
    }

    public void add(Voto voto) {
        if (voto.getVoto() >= 0) {
            listaVoti.add(voto);
        }
    }

    public int somma() {

        int somma = 0;
        for (Voto voto : this.listaVoti) {
            if (voto.getVoto() > 0 && voto.getVoto() < 100) {
                somma += voto.getVoto();
            }

        }
        return somma;
    }

    public int numVotiValidi() {
        int counter = 0;
        for (Voto voto : this.listaVoti) {
            if (voto.getVoto() > 0 && voto.getVoto() < 100) {
                counter++;
            }

        }
        return counter;
    }

    public double average() {
        if (this.listaVoti.isEmpty()) {
            return -1;
        }
        return (double) this.somma() / this.numVotiValidi();
    }

    public double averageValidi() {
        if (this.listaVoti.isEmpty()) {
            return -1;
        }
        int somma = this.sommaValidi();
        int counter = 0;
        for (Voto voto : this.listaVoti) {
            if (voto.getVoto() >= 50 && voto.getVoto() <= 100) {
                counter++;
            }

        }
        if (counter == 0) {
            return -1;
        }
        return (double) somma / counter;
    }

    public int sommaValidi() {
        if (this.listaVoti.isEmpty()) {
            return -1;
        }
        int somma = 0;
        for (Voto voto : this.listaVoti) {
            if (voto.getVoto() >= 50 && voto.getVoto() <= 100) {
                somma += voto.getVoto();
            }
        }
        return somma;
    }

    public double percentage() {
        int counter = 0;
        for (Voto voto : this.listaVoti) {
            if (voto.getVoto() >= 50 && voto.getVoto() <= 100) {
                counter++;
            }

        }

        if (counter == 0) {
            return 0.0;
        } else {
            return (double) (100 * counter) / this.numVotiValidi();
        }

    }

    public int pointsToGrade(int points) {
        if (points >= 90) {
            return 5;
        } else if (points < 90 && points >= 80) {
            return 4;
        } else if (points < 80 && points >= 70) {
            return 3;
        } else if (points < 70 && points >= 60) {
            return 2;
        } else if (points < 60 && points >= 50) {
            return 1;
        } else {
            return 0;
        }
    }

    public void stampaVoti() {
        int[] arrayVoti = new int[6];
        for (Voto voto : listaVoti) {
            int punti = pointsToGrade(voto.getVoto());
            arrayVoti[punti]++;
        }

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ":");
            for (int j = 0; j < arrayVoti[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}
