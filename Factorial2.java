public class Factorial2
{
public static void main(String[] args)
{
int num = 5;
long fact = 1;
int i = 1;
while (i<=num){
fact = fact*i;
i++;
}
System.out.println("Factorail of " + num + " = "+fact);
}
}