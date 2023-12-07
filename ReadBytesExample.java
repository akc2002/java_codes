import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytesExample 
{

    public static void main(String[] args) 
    {      

        try  
        {
            FileInputStream infile = new FileInputStream("city.txt");
            // Create a byte array to hold the read data
            byte[] bytesRead = new byte[1024]; // You can adjust the size based on your requirements

            // Read bytes from the file into the byte array
            int length;
            while ((length = infile.read(bytesRead)) != -1) 
            {
                // Process the read bytes as needed
                System.out.write(bytesRead, 0, length);
            }

            System.out.println("\nBytes read from file successfully.");
        } 
        catch (IOException e) 
        {
            System.err.println("Error reading bytes from file: " + e.getMessage());
        }
    }
}
