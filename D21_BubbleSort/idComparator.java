import java.util.Comparator;

public class idComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return firstStudent.getId().compareTo(secondStudent.getId());
    }
    
}
