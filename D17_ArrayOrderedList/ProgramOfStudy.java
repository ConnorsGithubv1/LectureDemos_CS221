import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProgramOfStudy implements Serializable, Iterable<Course> {

    private OrderedListADT<Course> list;

    public ProgramOfStudy() {
        //list = new LinkedList<Course>();
        list = new ArrayOrderedList<Course>();
    }

    public void addCourse(Course course) {
        if (course == null) { return; } // Guard statement
        list.add(course);
    }

    public Course find(String prefix, int number){
        for(Course course : list){
            if(prefix.equals(course.getPrefix()) && number == course.getNumber()){
                return course;
            }
        }
        return null;
    }

    public void replace(Course target, Course newCourse) {
        if (target == null || newCourse == null) { return; } // Guard statement
        if (list.contains(target) && !list.contains(newCourse)) {
            list.remove(target);
            list.add(newCourse);
        }
    }

    public String toString() {
        // String result = "";
        // for (Course course : list) {
        //     result += course + "\n";
        // }
        // return result;
        return this.list.toString();
    }

    public void save(String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this);
        oos.flush();
        oos.close();
    }

    public static ProgramOfStudy load(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ProgramOfStudy pos = (ProgramOfStudy)ois.readObject();
        ois.close();
        return pos;
    }

    @Override
    public Iterator<Course> iterator() {
        return list.iterator();
    }
}