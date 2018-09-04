public class Trigonometry
{
    public static void main ( String[] args)
    {
        double x = 30.0;
        double y = 30.0;
        double z = 1.0000;
        x = x * Math.PI/180;
        y = y * Math.PI/180;
        x = Math.sin(x);
        y = Math.cos(x);
        z = ((x*x) + (y*y));
        System.out.println("sine:" + x + "cosine:" + y + "sum of squares: " + z);
    }
}