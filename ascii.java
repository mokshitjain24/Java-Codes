
public class ascii {
 public static void main(String[] ar) {
	 //char ch = 'a';
	 //int asciival = ch;
	 //System.out.println(asciival);
	// for(int i =97;i<=122;i++) {
	//	 System.out.println("The ascii value of " + (char)(i)+" = "+i);
	 //}
	 String s = "abcdefghijklm";
	int l = s.length();
	 for(int i=0;i<l;i++) {
		 int asciival = s.charAt(i);
		 System.out.println(s.charAt(i) + " = " +asciival);
	 }
	 
 }
}
