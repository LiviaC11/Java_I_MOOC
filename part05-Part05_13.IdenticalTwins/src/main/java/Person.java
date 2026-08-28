
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }
        Person newP = (Person) obj;

        return this.name.equals(newP.name) && this.height == newP.height
                && this.birthday.getDay() == newP.birthday.getDay()
                && this.birthday.getMonth() == newP.birthday.getMonth()
                && this.birthday.getYear() == newP.birthday.getYear() && this.weight == newP.weight;
    }

    // implement an equals method here for checking the equality of objects
}
