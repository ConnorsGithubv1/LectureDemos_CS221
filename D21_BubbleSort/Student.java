
public class Student implements Comparable<Student> {

    private String id;
    private int examAverage, asssignmentAverage, overallAverage;

    public Student(String id) {
        this(id, 0, 0);
    }

    public Student(String id, int examAverage, int asssignmentAverage) {
        this.id = id;
        this.examAverage = examAverage;
        this.asssignmentAverage = asssignmentAverage;
        this.overallAverage = (examAverage + asssignmentAverage) / 2;
    }

    public String getId() {
        return id;
    }

    public int getExamAverage() {
        return examAverage;
    }

    public int getassignmentAverage() {
        return asssignmentAverage;
    }

    public int getOverallAverage() {
        return overallAverage;
    }

    public String toString() {
        String result = id;
        result += "\nAverages: \n";
        result += "Exam = " + examAverage + " \n";
        result += "Assignment = " + asssignmentAverage + " \n";
        result += "Overall = " + overallAverage + " \n";
        return result;
    }

    @Override
    public int compareTo(Student student) {
        return this.id.compareTo(student.getId());
    }
    
}