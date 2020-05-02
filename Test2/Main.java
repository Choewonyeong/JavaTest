// 메인 클래스
public class Main{
    public static void main(String[] args) {
        // 정수를 입력받는 클래스 호출
        InputNumber input = new InputNumber();
        // 입력받은 정수의 배수인지 검사하는 클래스 호출
        TestNumber test = new TestNumber();
        // 정수 변수를 선언함과 동시에
        // 정수를 반환하는 메소드를 통해 해당 변수에 정수 할당
        int number = input.getNumber();
        // 한 줄에 다섯개씩 출력하기 위한 카운트 변수 선언 및 0으로 초기화
        int cnt = 0;
        // 1~500까지 Loop 실행
        for(int i=1; i<=500; i++){
            // 입력받은 정수의 배수인지 검사하는 클래스에 변수값 할당
            test.setOperand(number, i);
            // 불리언 변수를 선언함과 동시에
            // 불리언 결과를 반환하는 메소드를 통해 해당 변수에 불리언 할당
            boolean bool = test.getBoolean();
            // true일 경우
            if(bool){
                // 현재 loop 변수의 값 출력
                System.out.print(" "+i);
                // 카운트 증가
                cnt++;
                // 카운트의 수에서 5를 나눈 나머지가 0일 경우
                // 즉, 다섯 번 출력하였을 경우
                if(cnt%5==0){
                    // 줄바꿈
                    System.out.println();
                }
            }
        }
    }
}
