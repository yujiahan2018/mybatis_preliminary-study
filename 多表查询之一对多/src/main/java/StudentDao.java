import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class StudentDao {
    public Teacher getTeacher(int id) throws IOException {
        SqlSession s = MyUtil.getSqlSession();
        Teacher l = s.selectOne("Student1.selectBlog",id);

        return l;
    }
}
