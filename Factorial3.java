import java.util.Scanner;
public class Factorial3
{
	public static void main(String[] args)
	{
	int num;
	long fact = 1;
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter number which foctorial you want: ");
	num = sc.nextInt();
	sc.close();
	int i = 1;
	while(i<= num)
	{
	fact = fact*i;
	i++;
	}
	System.out.println("Factorial of "+num+" = "+fact);
	}
}