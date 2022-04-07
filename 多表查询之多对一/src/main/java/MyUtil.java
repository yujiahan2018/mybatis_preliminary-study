import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyUtil {
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "config.xml";

        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        return sqlSessionFactory;
    }

    public static SqlSession getSqlSession() throws IOException {
        SqlSession sqlSes = getSqlSessionFactory().openSession();

        return sqlSes;
    }
}
