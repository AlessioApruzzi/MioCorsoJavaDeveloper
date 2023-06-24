package esercizi.civil_registry;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Getter
@AllArgsConstructor
public class Person implements Comparable<Person>{

    private String name, surname, fiscalCode, address;
    private LocalDate birthDate;
    private Set<Person> children;



    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Set<Person> getChildren() {
        return children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(fiscalCode, person.fiscalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fiscalCode);
    }

    @Override
    public int compareTo(Person o) {
        return Comparator
                .comparing(Person::getFiscalCode)
                .compare(this, o);
    }

}
