/*
 * -----------------------------------------------------------------------------------------------------------------------
 * 版权信息
 * Copyright (c) 2022.
 * Worker:JiahanYu./于家汉
 * Date:2022/4/7 下午2:59
 * 侵权必究
 * -----------------------------------------------------------------------------------------------------------------------
 *
 */

import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class Dao {
    public Teacher getTeacher(int id) throws IOException {
        SqlSession s = MyUtil.getSqlSession();
        Teacher teacher = s.selectOne("stu.selectBlog",id);

        return teacher;
    }

    public Student getStudent(int id) throws IOException {
        SqlSession s = MyUtil.getSqlSession();
        Student student = s.selectOne("tea.selectBlog",id);

        return student;
    }
}
