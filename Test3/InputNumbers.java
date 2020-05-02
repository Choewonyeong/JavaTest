import java.util.Scanner;

// 정수의 배열을 입력받는 클래스 선언
class InputNumbers{
    int[] getNumbers(){
        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요. :");
        // 배열의 인덱스 = 0, 1, 2, 3, 4
        // 따라서, 0부터 5미만까지 다섯번 반복
        for(int i=0; i<5; i++){
            numbers[i] = scan.nextInt();
        }
        // 입력 끝났으면 Scanner 객체 닫기
        scan.close();
        // 입력받은 정수의 배열 반환
        return numbers;
    }
}
