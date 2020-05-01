import java.util.Scanner;

class InputNumbers{
    public int[] getNumbers(){
        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요. :");
        for(int i=0; i<5; i++){
            numbers[i] = scan.nextInt();
        }
        scan.close();
        return numbers;
    }
}

class Calculate{
    int[] numbers;

    public void setOperand(int[] numbers){
        this.numbers = numbers;
    }

    public double getAvg(){
        int length = this.numbers.length;
        int sum = 0;
        for(int i=0; i<length; i++){
            sum += this.numbers[i];
        }
        double avg = (double)sum/length;
        return avg;
    }

    public double getDev(){
        double avg = getAvg();
        double total = 0;
        int length = this.numbers.length;
        for(int i=0; i<length; i++){
            total += Math.pow(this.numbers[i]-avg, 2);
        }
        double dev = total/length;
        return Math.sqrt(dev);
    }
}

public class Test3 {
    public static void main(String[] args) {
        InputNumbers input = new InputNumbers();
        Calculate result = new Calculate();
        int[] numbers = input.getNumbers();
        result.setOperand(numbers);
        double avg = result.getAvg();
        double dev = result.getDev();
        System.out.print("평균 :"+avg+"\n표준편차 :"+dev);
    }
}