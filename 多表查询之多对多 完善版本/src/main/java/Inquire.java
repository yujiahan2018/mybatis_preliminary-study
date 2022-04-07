/*
 * -----------------------------------------------------------------------------------------------------------------------
 * 版权信息
 * Copyright (c) 2022.
 * Worker:JiahanYu./于家汉
 * Date:2022/4/7 下午3:39
 * 侵权必究
 * -----------------------------------------------------------------------------------------------------------------------
 *
 */

import java.io.IOException;
import java.util.List;

public class Inquire {
    public static void inquireStuent(int id) throws IOException {
        Dao sd = new Dao();

        Teacher teacher = sd.getTeacher(id);
        List<Student> ls = teacher.getStu();
        for (Student s : ls)
            System.out.println("student_name:" + s.getNAME());
    }

    public static void inquireTeacher(int id) throws IOException {
        Dao sd = new Dao();

        Student student = sd.getStudent(id);
        List<Teacher> lt = student.getTea();
        for (Teacher t : lt)
            System.out.println("teacher_name:" + t.getTea_NAME());

    }
}
