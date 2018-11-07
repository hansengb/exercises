class Pantry

{
  // Instance Variables
  private Jam jar[]

  // Constructors
  Pantry( Jam jar[n])
  {
    this . jar1 = jar1 ;
    this . jar2 = jar2 ;
    this . jar3 = jar3 ;
    selected = null ;
  }
  // Methods
  public String toString()
  {
    String str = "";
    str += "1: " +  jar1.toString()  + "\n";
    str += "2: " +  jar2.toString()  + "\n";
    str += "3: " +  jar3.toString()  + "\n";     
    return str;
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public void select( int jarNumber )
  {
      selected =  jar[jarNumber];
  }

  // spread the selected jam
  public void spread( int oz )
  {
    selected . spread( oz ) ;
  }
}

