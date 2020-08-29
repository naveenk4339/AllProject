import java.util.List;

public class ReverseOfStringFunction {
	
	public static void main(String[] args) {
		
		String name ="naveen";
		char[] a = name.toCharArray();
		printReverse(a);
	}

	private static void printReverse(char[] a) {
		
		helper(0,a);
		
	}

	private static void helper(int i, char[] a) {
		if(a == null || i >= a.length) {
			return;
			
		}
		
		helper(i+1, a);
		System.out.println(a[i]);
	}



}
