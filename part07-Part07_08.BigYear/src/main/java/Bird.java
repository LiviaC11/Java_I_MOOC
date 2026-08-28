public class Bird {
    private String name;
    private String latinName;
    private int osservazioni;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.osservazioni = 0;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getOsservazioni() {
        return this.osservazioni;
    }

    public void addOsservazione() {
        this.osservazioni++;
    }

    @Override
    public String toString() {
        return name + "(" + latinName + "): " + osservazioni + " observations";
    }

}
