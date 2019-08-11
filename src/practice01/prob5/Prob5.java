package practice01.prob5;

public class Prob5 {
	public static void main (String args[]) {
		for(int i=1 ; i<100; i++) {
			String[] s = Integer.toString(i).split("");
			int n=0;
			for(int j=0 ; j<s.length ; j++) {
				if(Integer.parseInt(s[j])%3==0 && Integer.parseInt(s[j])!=0) {
					n++;
				}
			}
			
			if(n==2) {
				System.out.println(i+" 짝짝");
				
			}else if(n==1) {
				System.out.println(i+" 짝");
				
			}
		}
		
	}
}