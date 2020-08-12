package hr.priorityqueue;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        int cga = Double.valueOf(this.cgpa).compareTo(Double.valueOf(o.cgpa)) * -1;
        if (cga == 0) {
            int names = this.name.compareTo(o.name);
            if (names == 0)
                return Integer.valueOf(this.id).compareTo(Integer.valueOf(o.id));
            else
                return names;
        }else {
            return cga;
        }
    }
}
