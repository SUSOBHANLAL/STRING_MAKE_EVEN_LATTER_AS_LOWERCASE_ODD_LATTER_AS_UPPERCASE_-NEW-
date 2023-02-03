package makeOddPostionAscapital;

public class susobhan {
	public static void main(String args[]) {
		String s= "susobhan";
		int n = s.length();
		String Flower="";
		
		
		String Fupper="";
		String result="";
		
		for(int i =0;i<n;i++) {
			String lower="";

			String upper="";
			if(i%2==0) {
				lower=String.valueOf(s.charAt(i)).toLowerCase();;
				
			}
			else if(i%2!=0) {
				upper=String.valueOf(s.charAt(i)).toUpperCase();
				
			}
			result+=lower+upper;	
		}
		
		
		System.out.print(result);
	}

}
