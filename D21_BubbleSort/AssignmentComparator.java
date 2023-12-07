import java.util.Comparator;

public class AssignmentComparator implements Comparator<Student>{

    @Override
    public int compare(Student firStudent, Student secStudent) {
        Integer firstAverage = firStudent.getassignmentAverage();
        Integer secondAverage = secStudent.getassignmentAverage();

        return firStudent.compareTo(secondAverage);
    }
    
}
