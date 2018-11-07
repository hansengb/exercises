public class Cylinder
{
    double radius;
    double height;
    

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double volume(){
        return (Math.PI * radius * radius * height);

    }
    public double surfaceArea(){
        return (2 * Math.PI * radius * radius + 2 * Math.PI * radius * height);

    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setRadius(int radius){
        this.radius = height;
    }

    public double getHeight(){
        return height;
    }

    public double getRadius(){
        return radius;
    }

}