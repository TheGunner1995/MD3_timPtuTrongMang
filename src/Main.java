import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"đinh văn khiet", "thai phuong nam", "to tran hieu"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào đây : ");
        String input = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (input.equalsIgnoreCase(students[i])){
                System.out.println(input+ "ở vị trí thứ "+ i + "trong students");
                check = false;
               break;
            }
        }
        if (!check){
            System.out.println("không có");

        }


    }
}