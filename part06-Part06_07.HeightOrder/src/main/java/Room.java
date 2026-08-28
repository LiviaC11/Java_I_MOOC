import java.util.ArrayList;

public class Room {
    private final ArrayList<Person> inquilini;

    public Room() {
        this.inquilini = new ArrayList<>();
    }

    public void add(Person person) {
        this.inquilini.add(person);
    }

    public boolean isEmpty() {
        if (this.inquilini.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {

        return this.inquilini;
    }

    public Person shortest() {
        if (this.inquilini.isEmpty()) {
            return null;
        }
        Person shortestP = this.inquilini.get(0);
        for (Person person : this.inquilini) {

            if (person.getHeight() < shortestP.getHeight()) {
                shortestP = person;
            }
        }
        return shortestP;

    }

    public Person take() {
        if (this.inquilini.isEmpty()) {
            return null;
        }

        Person toRemove = this.shortest();
        if (this.inquilini.contains(toRemove)) {
            this.inquilini.remove(toRemove);
            return toRemove;
        }
        return null;
    }
}
