import fizzbuzz.buzzy;
import arrays.arraylooping;
import classes.book;
import oop.bird;
import oop.duck;
import oop.Employee;

public class runner{
    public static void main(String[] args){
        // system.out.println(buzzy.fizzybuzz()); runs fuzzbuzz
        // arraylooping.arrayloops();
        // book George = new book("GeorgeSmash!", true, "Moon Speak", "Philosophy");
        // System.out.println(George.getName());
        // bird exampBird = new bird("hawk", false, 1, true, "Some", 2, 3);
        Employee James = new Employee("James", 20, "Annoying", 52);
        System.out.println(James.calculateWeeklySalary());

    }
}