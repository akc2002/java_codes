public class Finally {
    public static void main(String args[])
    {
        int a[] = {5,10};
        try{
            int x = a[2] / a[0];
            System.out.println("The value of x = "+x);
        }
        finally
        {
            int y = a[1] / a[0];
            System.out.println("y = "+y);
        }
    }
}
