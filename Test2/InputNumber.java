import java.util.Scanner;

public class InputNumber{
    int getNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요. :");
        int number = scan.nextInt();
        scan.close();
        return number;
    }
}