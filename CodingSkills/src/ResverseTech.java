import java.util.LinkedList;

public class ResverseTech {
	
	
	static char[] ch = {'h','e','l','l','o' };
	
	
	public static void main(String[] args) {
		
		  System.out.println(ch); 
		  reverseString(ch); System.out.println(ch);
	
		/*
		 * char[] st = {'t','y','h'};
		 * 
		 * System.out.println(st); for (int i = 0; i < st.length; i++) { char temp =
		 * st[i++]; st[i] = st[i]; System.out.println(st[i++] + " :  : " + temp); }
		 */
	}
	
	public static void reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;
		for (int i = left; i < right; i++) {

			char temp = s[left];
			s[left++] = s[right];//last
			s[right--] = temp;

		}
	}

}
