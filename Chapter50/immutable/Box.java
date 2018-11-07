public class Box{
    double width;
    double height;
    double length;

    public Box(double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(Box oldBox){
        this.height = oldBox.height();
        this.width  = oldBox.width();
        this.length = oldBox.length();
    }

    public Box biggerBox( Box oldBox )
    {
      return new Box( 1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());
    }

    public Box smallerBox( Box oldBox )
    {
      return new Box( 0.75*oldBox.width(), 0.75*oldBox.height(), 0.75*oldBox.length());
    }

    public boolean nests(Box outsideBox){
        if(outsideBox.length() >= length && outsideBox.width() >= width && outsideBox.height() >= height){
            return true;
        }else{
            return false;
        }
    }

    public double length(){
        return length;
    }
    public double width(){
        return width;
    }
    public double height(){
        return height;
    }

    public double volume(){
        return width * height * length;
    }

    public double area(){
        return 2*faceArea() + 2*topArea() + 2*sideArea();
    }

    public double faceArea(){
        return width*height;
    }

    public double topArea(){
        return width*length;
    }

    public double sideArea(){
        return length*height;
    }


}