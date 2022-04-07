public class Student {
    private int ID;
    private String NAME;
    private String SEX;
    private Teacher teacher;

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", SEX='" + SEX + '\'' +
                ", teacher=" + teacher +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
