import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 19));
        students.add(new Student("Charlie", 24));
        students.add(new Student("Dana", 20));
        students.add(new Student("Evan", 21));
        students.add(new Student("Fiona", 23));
        students.add(new Student("George", 25));
        students.add(new Student("Hannah", 20));
        students.add(new Student("Ian", 22));
        students.add(new Student("Jenna", 18));
        students.add(new Student("Kyle", 23));
        students.add(new Student("Lila", 21));

        System.out.println("ArrayList prima dell'ordinamento:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int nameComp = s1.getName().compareTo(s2.getName());
                if (nameComp != 0) return nameComp;
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });

        System.out.println("\nArrayList dopo l'ordinamento:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
