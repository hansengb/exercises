public class Cone
{
    double radius;
    double height;
    

    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double slantHeight(){
        radius = radius * radius;
        height = height * height;
        return Math.sqrt(radius + height);
    }

    public double angle(){
        return Math.atan(radius/height);
    }

    

    


}