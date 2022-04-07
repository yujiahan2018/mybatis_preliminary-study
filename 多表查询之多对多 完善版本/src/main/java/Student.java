import java.util.List;

public class Student {
    private int ID;
    private String NAME;
    private String SEX;
    private List<Teacher> tea;

    public List<Teacher> getTea() {
        return tea;
    }

    public void setTea(List<Teacher> tea) {
        this.tea = tea;
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

}
