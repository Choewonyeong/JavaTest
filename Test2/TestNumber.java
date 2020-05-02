public class TestNumber{	
    int number, loop;

    void setOperand(int number, int loop){
        this.number = number;
        this.loop = loop;
    }
    
    boolean getBoolean(){
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