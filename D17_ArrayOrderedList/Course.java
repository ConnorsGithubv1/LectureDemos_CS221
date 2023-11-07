import java.io.Serializable;

public class Course implements Serializable, Comparable<Course> {
    private String prefix;
    private int number;
    private String title;
    private Grade grade;

    public Course(String prefix, int number, String title) {
        this(prefix, number, title, Grade.NOT_TAKEN);
    }

    public Course(String prefix, int number, String title, Grade grade) {
        this.prefix = prefix;
        this.number = number;
        this.title = title;
        this.grade = grade;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public boolean taken() {
        return grade != Grade.NOT_TAKEN;
    }

    public String getCourseString() {
        return this.prefix + "-" + this.number;
    }

    public boolean equals(Object otherCourse) {
        if (!(otherCourse instanceof Course)) { return false; } // Guard statement
        return this.getCourseString().equals(((Course)otherCourse).getCourseString());
    }

    public String toString() {
        return getCourseString() + ": " + this.title + (taken() ? " [" + this.grade + "]" : "");
    }

    @Override
    public int compareTo(Course course) {
        return this.getCourseString().compareTo(course.getCourseString());
    }
}
