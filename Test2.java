import java.util.Scanner;

class InputNumber{
    public int getNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요. :");
        int number = scan.nextInt();
        scan.close();
        return number;
    }
}

class TestNumber{
    int number, loop;

    public void setOperand(int number, int loop){
        this.number = number;
        this.loop = loop;
    }

    public boolean getBoolean(){
        boolean bool = false;
		if(this.loop < this.number){
            bool = false;
		}
		else if(this.loop % this.number != 0){
            bool = false;
		}
		else if(this.loop % this.number == 0){
            bool = true;
        }
        return bool;
    }
}

public class Test2{
    public static void main(String[] args) {
          InputNumber input = new InputNumber();
          TestNumber test = new TestNumber();
          int number = input.getNumber();
          int cnt = 0;
          for(int i=1; i<=500; i++){
            test.setOperand(number, i);
            boolean bool = test.getBoolean();
            if(bool){
                System.out.print(" "+i);
                cnt++;
                if(cnt%5==0){
                    System.out.println();
                }
            }
        }
    }
}
