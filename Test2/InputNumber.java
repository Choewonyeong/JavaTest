import java.util.Scanner;

// 정수를 입력받는 클래스 선언
public class InputNumber{
    int getNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요. :");
        int number = scan.nextInt();
        // 입력 끝났으면 Scanner 객체 닫기
        scan.close();
        // 입력받은 정수 반환
        return number;
    }
}