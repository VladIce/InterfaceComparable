package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(100, "Zaur", "Tregulov", 12345));
        list.add(new Employee(15, "Ivan", "Petrov", 6542));
        list.add(new Employee(123, "Ivan", "Sidorov", 8542));
        list.add(new Employee(1234, "Ivan", "Ivanov", 1444));
        System.out.println("Before sorting: \n" + list);
        Collections.sort(list);
        System.out.println("After sorting: \n" + list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", salary=" + salary + '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.id, employee.id);
    }
}
