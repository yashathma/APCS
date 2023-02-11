package November.Monday4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Names {
    public static void main(String[] args) {
        ArrayList<Student> people = new ArrayList<>();
        people.add(new Student(1,2,10,"Nadia"));
        people.add(new Student(3,3,8,"Abby"));
        people.add(new Student(10,0,0,"Hobart"));

        System.out.println(people);

        Collections.sort(people);

        System.out.println(people);
    }
}
