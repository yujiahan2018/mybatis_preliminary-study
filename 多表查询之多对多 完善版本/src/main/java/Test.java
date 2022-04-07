import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int choose = 0,id = 0;


        do {
            System.out.println("0.退出程序\n1.查询Teacher\t2.查询Student");
            System.out.println("========================请选择你要进行的操作对应编号========================");
            choose = in.nextInt();

            if (choose == 0) System.exit(0);

            else {
                System.out.println("请输入查询id:");
                id = in.nextInt();


                System.out.println("========================查询结果输出========================");
                if (choose == 1) {
                    Inquire.inquireTeacher(id);
                } else if (choose == 2) {
                    Inquire.inquireStuent(id);
                }
                else System.out.println("输入有误,请重新输入");
                System.out.println();
            }
        } while (id!=0);
    }
}
