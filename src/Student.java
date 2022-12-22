import java.util.Scanner;

public class Student {
    private String FIO;
    private int IDnum;
    private int Finals;
    public Student (String _FIO, int _IDnum, int _Finals) {
        FIO = _FIO;
        IDnum = _IDnum;
        Finals = _Finals;
    }

    public String getFIO(){ return FIO;}
    public int getIDnum() {
        return IDnum;
    }
    public int getFinals() {
        return Finals;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("FIO : ").append(getFIO());
        sb.append("; IDnum : ").append(getIDnum());
        sb.append("; Finals : ").append(getFinals());
        sb.append("}");
        return sb.toString();
    }
    public static void showRes(Student[] list) {
        for (int index = 0; index < list.length; index++) {
            System.out.println(list[index]);
        }
        System.out.println("========================================================");
    }
}