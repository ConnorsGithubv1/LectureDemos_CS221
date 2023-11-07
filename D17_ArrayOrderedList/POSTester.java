import java.io.IOException;

public class POSTester {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProgramOfStudy pos = new ProgramOfStudy();
        pos.addCourse(new Course("CPSC", 221, "Computer Science II"));
        pos.addCourse(new Course("PHYS", 212, "Physics for Scientists and Engineers II"));
        pos.addCourse(new Course("MATH", 170, "Calculus I", Grade.A));
        pos.addCourse(new Course("CPSC", 121, "Computer Science I", Grade.A_MINUS));
        pos.addCourse(new Course("MATH", 175, "Calculus II", Grade.B_PLUS));
        pos.addCourse(new Course("PHYS", 211, "Physics for Scientists and Engineers I", Grade.C));

        System.out.println(pos);

        System.out.println();

        pos.replace(new Course("PHYS", 212, ""), new Course("CHEM", 111, "General Chemistry I", Grade.A_MINUS));

        //String fileName = "ProgramOfStudy.dat";
        // pos.save(fileName);
        //ProgramOfStudy pos = ProgramOfStudy.load(fileName);

        System.out.println(pos);
    }
}
