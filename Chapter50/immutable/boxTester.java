class BoxTester
{

  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;
     Box steve = box.biggerBox(box);
     Box meeve = box.smallerBox(box);


     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

     System.out.println( "length: " + box.length + " height: " + box. height +
                         "width:  " + box.width )  ;
     System.out.println( "Height: "  + steve.height() + " length: " + steve.length() );
     System.out.println( "Height: "  + meeve.height() + " length: " + meeve.length() );
     System.out.println(steve.nests(meeve));
     System.out.println(meeve.nests(steve));
  }
}