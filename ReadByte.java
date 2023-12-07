import java.io.FileInputStream;
import java.io.IOException;
public class ReadByte
{
    public static void main(String args[])
	{
		try
		{
			//connect infile stram to the required file
			FileInputStream infile = new FileInputStream("city.txt");
			int b;
			//Read and display data
			while((b = infile.read()) != -1)
			{
				System.out.print((char)b);
			}
			infile.close();
		}	
		catch(IOException e)	
		{
			System.out.println("Error reading bytes from file: "+e.getMessage());
		}
        finally
        {
            System.out.println("hello java");
        }
	}
}
