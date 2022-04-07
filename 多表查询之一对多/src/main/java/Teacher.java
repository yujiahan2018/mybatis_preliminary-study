import java.util.List;

public class Teacher {
    int tea_ID;
    String tea_NAME;
    List<Student> stu;

    public String getTea_NAME() {
        return tea_NAME;
    }

    public void setTea_NAME(String tea_NAME) {
        this.tea_NAME = tea_NAME;
    }

    public int getTea_ID() {
        return tea_ID;
    }

    public void setTea_ID(int tea_ID) {
        this.tea_ID = tea_ID;
    }

    public List<Student> getStu() {
        return stu;
    }

    public void setStu(List<Student> stu) {
        this.stu = stu;
    }
}
