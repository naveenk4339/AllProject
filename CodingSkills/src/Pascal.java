import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row number");
		int row = scan.nextInt();
		printPascal(row);

	}

	private static void printPascal(int row) {

		for (int i = 0; i < row; i++) {
//System.out.print(" i value :"+i);
			for (int j = 0; j <= i; j++) {
				//System.out.print("  J value: "+j);
				System.out.print(" "+pascal(i, j) + " ");
			}
			System.out.println();
		}

	}

	private static int pascal(int i, int j) {

		if (j == 0)
		{
			return 1;
		} else if (j == i) 
		{
			return 1;

		}
		return pascal(i - 1, j - 1) + pascal(i - 1, j);
	}

}
