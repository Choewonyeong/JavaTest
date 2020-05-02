// 메인 클래스
public class Main {
    public static void main(String[] args) {
        // 정수의 배열을 입력받는 클래스 호출
        InputNumbers input = new InputNumbers();
        // 평균값과 표준편차를 계산하는 클래스 객체 호출
        Calculate result = new Calculate();
        // 정수의 배열 변수를 선언함과 동시에 
        // 정수의 배열을 반환하는 메소드를 통해 해당 변수에 정수의 배열 할당
        int[] numbers = input.getNumbers();
        // 평균값과 표준편차를 계산하는 클래스에 변수값 할당
        result.setOperand(numbers);
        // 평균값 변수를 선언함과 동시에 
        // 편균값을 반환하는 메소드를 통해 해당 변수에 평균 값 할당
        double avg = result.getAvg();
        // 표준편차 변수를 선언함과 동시에 
        // 표준편차를 반환하는 메소드를 통해 해당 변수에 표준편차 할당
        double dev = result.getDev();
        // 결과 출력
        System.out.print("평균 :"+avg+"\n표준편차 :"+dev);
    }
}