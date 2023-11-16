import java.io.*;
import java.lang.*;
class Room 
{
  
    float l;
    float b;
    void getData(float x,float y)
    {
        l = x;
        b = y;
    }
}
class RoomArea
{
    public static void main(String[] arjun)
    {
        float area;
        Room r1 = new Room();
        r1.getData(14,10);
        area = r1.l*r1.b;
        System.out.println("Area  = "+area);
    }
}