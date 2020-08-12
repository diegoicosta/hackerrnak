package hr.priorityqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> queue = new PriorityQueue();
        for (String event : events) {
            String[] eventSplit = event.split(" ");
            if (eventSplit.length > 1)
                queue.add(new Student(Integer.parseInt(eventSplit[3]), eventSplit[1], Double.parseDouble(eventSplit[2])));
            else {
                if (!queue.isEmpty())
                    queue.remove();
            }
        }

        List<Student> students = new ArrayList();

        while (!queue.isEmpty()) {
            students.add(queue.remove());
        }
        return students;
    }
/*
Dan
Ashley
Shafaet
Maria


Maria
Mark
Shafaet
Samiha
Ashley
John
Anik
Dan
 */


}
