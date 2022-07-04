import java.util.*;
public class fibseries
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of series you want to display");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c;
		System.out.print("Series :-"+"0 1 ");
		for(int i = 0 ; i  < n - 2 ; i++ ){
		    c = a + b ;
		    System.out.print(c+" ");
		    a = b;
		    b = c;
		}
	}
}
