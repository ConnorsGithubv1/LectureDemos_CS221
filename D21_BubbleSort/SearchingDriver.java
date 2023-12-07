import java.util.Arrays;

public class SearchingDriver {
    
    public static void main(String[] args) {
        Student[] students = new Student[5];

        //  student we are searching for
        Student target = new Student("Mary");

        students[0] = new Student("Mary", 97, 70);
        students[1] = new Student("James", 80, 80);
        students[2] = new Student("Mark", 75, 94);
        students[3] = new Student("Jolene", 95, 85);
        students[4] = new Student("Cassandra", 85, 75);
        // students[4] = new Student("Mary", 97, 70);
        // students[1] = new Student("James", 80, 80);
        // students[3] = new Student("Mark", 75, 94);
        // students[2] = new Student("Jolene", 95, 85);
        // students[0] = new Student("Cassandra", 85, 75);

        System.out.println("Unsorted: \n -----------------");
        for (Student student : students) {
            System.out.println(student);
        }

//        compares in reverse order
        // Arrays.sort(students,
        //         (firstStudent, secondStudent) -> -firstStudent.getId().compareTo(secondStudent.getId())
        //         );

        // exam average in reverse order ('-')
        // Arrays.sort(students,
        //         (firstStudent, secondStudent) -> 
        //             -((Integer)firstStudent.getExamAverage()).compareTo(((Integer)secondStudent.getExamAverage()))
        //         );

        //Arrays.sort(students, new idComparator());
        //Arrays.sort(students, new AssignmentComparator());
        //Array.sort(students, new OverallComparator()
    

        /* different sorting algorithims to be switched out ->> */
        // Sorting.selectionSort(students);
        // Sorting.bubbleSort(students);
        // Sorting.quickSort(students, 0, students.length - 1);
        Sorting.mergeSort(students, 0, students.length - 1);

        System.out.println("\nSorted: \n -----------------");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.print("\ndid we find: " + target.getId() + "\n");
        //System.out.println(Searching.linearSearch(students, target) ? "yes" : "no");
        System.out.println(Searching.binarySearch(students, target) ? "yes" : "no");
    }
}
