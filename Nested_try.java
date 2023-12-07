public class Nested_try 
{
    public static void main(String args[])
    {
        try
        {
            int a=2,b=4,c=2,x=7,z;
            int p[] =  {2,3};
            p[1] = 33;       
        
            try 
            {   
                z = x/((b*b)-(4*a*c));
                    System.out.println("The value of z is = "+z);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Division by zero in Arithmetic expression");
            }
        
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out-of-bounds");
        }
    }
}
