class Pantry

{
  // Instance Variables
  public Jam[] jams;
  private Jam selected;

  // Constructors
  Pantry( Jam[] jams)
  {
    this . jams = jams;
    selected = null ;
  }
  // Methods
  public String toString()
  {
    String str = "";
    for(int i = 0; i <= jams.length - 1; i++){
      str += (i+1) + ": " +  jams[i].toString()  + "\n";    
    }
    return str;
  }

  // assume that the user entered a correct selection, 1, 2, or 3
  public void select( int jarNumber )
  {
    selected = jams[jarNumber-1];
  }

  // spread the selected jam
  public void spread( int oz )
  {
    System.out.println(selected);
    System.out.println(oz);
    selected . spread( oz ) ;
  }

  public int length(int jar){
    return jams.length;
  }
}

