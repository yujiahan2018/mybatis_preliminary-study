import java.io.IOException;
import java.util.List;

public class Test {
    @org.junit.Test
    public void Test() throws IOException {
        Dao sd = new Dao();

        Teacher teacher = sd.getTeacher(2);
        Student student = sd.getStudent(2);

        List<Teacher> lt = student.getTea();
        List<Student> ls = teacher.getStu();

        for (Student s : ls) {
            System.out.println("student_name:" + s.getNAME());
        }

        System.out.println("===================我是分割符==================");

        for (Teacher t : lt) {
            System.out.println("teacher_name:" + t.getTea_NAME());
        }
    }
}
