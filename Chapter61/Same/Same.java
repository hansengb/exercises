import java.util.Arrays;
class Same
{
  public static boolean sameElts( int[] a, int[] b )
  {
      int[] sortedA = a;
      int[] sortedB = b;
      Arrays.sort(sortedA);
      Arrays.sort(sortedB);
      if(sortedA.length != sortedB.length){
          return false;
      } else{
          for(int i = 0; i < sortedA.length; i++){
            if (sortedA[i] != sortedB[i]){
                return false;
            }
          }
      }
      return true;

  }
  
  public static void main ( String[] args )
  {
    int[] arrayA = { 1, 2, 3, 4, 2 };
    int[] arrayB = { 4, 2, 3, 2, 1 };

    if ( sameElts( arrayA, arrayB ) )
      System.out.println( "Same Elements" );
    else
      System.out.println( "DIFFERENT elements" );      
 
  }
}