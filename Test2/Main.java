
public class Main{
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
