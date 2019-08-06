package practice01.prob2;

public class Prob2 {
	public static void main(String args[]) {
		int val = 0;
        for(int i =0; i<10; i++) {  
            for(int j=1; j<10; j++) {
            	val = i + j;
                System.out.print(val + " ");  
            }
            System.out.println(""); 

        }
    }
}
