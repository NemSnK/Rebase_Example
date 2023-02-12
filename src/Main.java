import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        Person sara = new Person("Sara", 44);

        List<Person> collection = asList(sara);

        System.out.println(getKidNames(collection));
    }

    public static Set<String> getKidNames(List<Person> people) {
        return people.stream()
                .map(Person::getName)
                .collect(Collectors.toSet());
    }

    public void someMethod() {}
}