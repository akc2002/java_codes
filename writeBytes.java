import java.io.FileOutputStream;
import java.io.IOException;
class writeBytes 
{
    public static void main(String args[])
    {
        //Declare and initialize a byte array
        byte cities[] = {'D','e','l','h','i',' ','M','a','d','r','a','s','h'};
        //create an output file stream        
        try 
        {
            
                //connect the outfile stream to "city.txt"
                FileOutputStream outfile = new FileOutputStream("city.txt");
                //write data to the stream
                outfile.write(cities);
                outfile.close();    
            
        } 
        catch (IOException ioe) 
        {
            System.out.println(ioe);
            System.exit(-1);
        }
    }
}
