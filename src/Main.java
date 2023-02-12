import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 44);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        List<Person> collection = asList(sara, eva, viktor, anna);

        System.out.println(getKidNames(collection));
    }

    public static Set<String> getKidNames(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() <18)
                .map(Person::getName)
                .collect(Collectors.toSet());
    }
}