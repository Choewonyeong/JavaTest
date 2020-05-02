// 평균값과 표준편차를 계산하는 클래스 객체 선언
class Calculate{
    // 클래스 변수 선언
    int[] numbers;

    // 변수값 할당 메소드
    void setOperand(int[] numbers){
        // this : Calculate.numbers
        this.numbers = numbers;
    }

    // 평균값 계산 메소드
    double getAvg(){
        // 배열의 길이 변수 선언
        int length = this.numbers.length;
        // 배열의 원소들의 합계 변수 선언
        int sum = 0;
        // 배열의 길이 만큼 Loop 돌면서 배열의 원소 합계 산출
        for(int i=0; i<length; i++){
            sum += this.numbers[i];
        }
        // 평균값 변수 선언, 평균값 = 합계/배열의 길이
        double avg = (double)sum/length;
        // 평균값 반환
        return avg;
    }
    
    // 표준편차 계산 메소드
    double getDev(){
        // 배열의 길이 변수 선언
        int length = this.numbers.length;
        // 평균값 변수 선언(평균값 계산 메소드 호출)
        double avg = getAvg();
        // 집단의 분산 합계 변수 선언
        double totalVariance = 0;
        // 배열의 길이 만큼 Loop 돌면서 집단의 분산 합계 산출
        for(int i=0; i<length; i++){
            // 집단의 분산 = (i번째 개체의 측정값 - 집단의 평균)^2
            // pow 함수는 거듭제곱을 구하는 함수(수, 제곱 수)
            totalVariance += Math.pow(this.numbers[i]-avg, 2);
        }
        // 집단의 분산 = 집단의 분산 합계 ÷ 집단의 수(=배열의 길이)
        double dev = totalVariance/length;
        // 집단의 표준편차 반환, 집단의 표준편차 = 집단의 분산의 제곱근
        // sqrt 함수는 제곱근을 구하는 함수
        return Math.sqrt(dev);
    }
}
