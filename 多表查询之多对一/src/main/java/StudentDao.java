import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class StudentDao {
    public List<Student> getAll() throws IOException {
        SqlSession s = MyUtil.getSqlSession();
        List<Student> l = s.selectList("Student1.selectBlog");
//        List<Student> l = s.selectList("Student1.selectBlog");

        return l;
    }
}
