
public class DisplayProperties {

	public static void main(String[] args) {
		String str="stay happy\n stay safe";
		int cc=0,cw=1,cl=1;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='\n') {
				cl++;
			}
			else if (str.charAt(i) ==' ') {
				cw++;
			}
			else if (str.charAt(i)!=' ') {
				cc++;
			}
		}
		 System.out.println("\nNumber of lines : "+cl);
         System.out.println("\nNumber of words : "+cw);
         System.out.println("\nNumber of characters : "+cc);
	}

}
