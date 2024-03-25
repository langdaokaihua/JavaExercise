package basics;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        for (String student :
                students) {
            System.out.println(student);
        }

    }
}
