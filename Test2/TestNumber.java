// 입력받은 정수의 배수인지 검사하는 클래스 객체 선언
public class TestNumber{
    // 클래스 변수 선언	
    int number, loop;

    // 변수값 할당 메소드
    void setOperand(int number, int loop){
        // this : Calculate
        this.number = number;
        this.loop = loop;
    }
    // 불리언 반환 메소드
    boolean getBoolean(){
        // 불리언 변수 선언
        boolean bool = false;
        /* loop(1~500)가 입력받은 정수보다 작을 경우 
            => 해당 정수의 배수 아님
        불리언 변수에 false 할당 */
        if(this.loop < this.number){
            bool = false;
	    }
        /* loop(1~500)에서 입력받은 정수를 나눈 나머지가 0이 아닐 경우 
            => 해당 정수의 배수 아님
        불리언 변수에 false 할당 */
	    else if(this.loop % this.number != 0){
            bool = false;
	    }
        /* loop(1~500)에서 입력받은 정수를 나눈 나머지가 0일 경우 
            => 해당 정수의 배수임
        불리언 변수에 true 할당 */
	    else if(this.loop % this.number == 0){
            bool = true;
        }
        // 불리언 반환
	    return bool;
    }
}