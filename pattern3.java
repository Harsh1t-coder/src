
public class pattern3 {
	public static void main(String args[]) {
		char x = 'A';
		for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(x);
			}
			x++;
			System.out.println();
		}
	}
}
