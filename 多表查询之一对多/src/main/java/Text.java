import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class Text {
    public static void main(String[] args) throws IOException {
        StudentDao sd = new StudentDao();
        Teacher teacher = sd.getTeacher(2);
        System.out.println("teacher name: " + teacher.getTea_NAME());
        List<Student> l = teacher.getStu();

        for (Student student : l) {
            System.out.println("student_name:" + student.getNAME());
        }
    }
}
