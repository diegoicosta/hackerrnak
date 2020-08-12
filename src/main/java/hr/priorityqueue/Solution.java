package hr.priorityqueue;

import java.util.*;

public class Solution {
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        Iterator<String> scan = Arrays.asList(
                "12",
                "ENTER John 3.75 50",
                "ENTER Mark 3.8 24",
                "ENTER Shafaet 3.7 35",
                "SERVED",
                "SERVED",
                "ENTER Samiha 3.85 36",
                "SERVED",
                "ENTER Ashley 3.9 42",
                "ENTER Maria 3.6 46",
                "ENTER Anik 3.95 49",
                "ENTER Dan 3.95 50",
                "SERVED"
        )
        .iterator();

        //

        int totalEvents = Integer.parseInt(scan.next());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.next();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }

    }
}
