import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Text {
    public static void main(String[] args) throws IOException {
        StudentDao sd = new StudentDao();
        List<Student> l = sd.getAll();

        for (Student student : l) {
            System.out.println("student_name:" + student.getNAME() +
                    "\tteacher_name:" +
                    student.getTeacher().getNAME());
        }
    }
}
