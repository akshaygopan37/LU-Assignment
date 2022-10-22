import java.util.*;

public class swap
{
	public static void main(String[ ] args)
	{
		int a,b;
		Scanner in=new Scanner(System.in);

		System.out.println("Enter value of a: ");
		a=in.nextInt();
		System.out.println("Enter value of a: ");
		b=in.nextInt();

		System.out.println("Before swapping - a: "+ a +", b: " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping  - a: "+ a +", b: " + b);
	}
}