import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

import static org.apache.commons.lang3.StringUtils.*;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final int unit;
    private final float salary;
    public Employee(String firstName, String secondName, int unit, float salary) {
        this.firstName = capitalize(firstName.toLowerCase());
        this.lastName = capitalize(secondName.toLowerCase());
        this.unit = unit;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getUnit() {
        return unit;
    }
    public float getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return firstName + " " + lastName + " [подразделение: " + unit + ", з/п: " + String.format("%,.2f", salary) + " руб.]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}