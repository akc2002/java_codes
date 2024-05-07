import java.io.*;
import java.lang.*;
class Datas 
{
  
    private float l;
    private float b;
    void getData(float x,float y)
    {
        l = x;
        b = y;
    }
    public float Area()
    {
        return(l*b);
    }
}
class RoomArea
{
    public static void main(String[] arjun)
    {
        float area;
        Datas r1 = new Datas();
        r1.getData(14,10);
        area = r1.Area();
        System.out.println(area);
        
    }
}