
import java.io.* ;

class Smooth
{

  public static void main ( String[] args )  
  {
    int[] signal  = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
    int[] smooth = new int[signal.length];
    
    // compute the smoothed value for each
    //  cell of the array smooth
    smooth[0]  =  (signal[0] + signal[1])/2;
    smooth[ signal.length-1 ] = (signal[signal.length - 2] + signal[signal.length - 1])/2;
    for ( int j = 1; j < smooth.length - 1; j++)
    {
        smooth[j] = (signal[j-1] + signal[j] + signal[j+1])/3;
    }
      
    // write out the input
    for ( int j=0; j < smooth.length; j++)
    {
        System.out.print(signal[j] + " ");

    }
    System.out.print("\n");
    
    // write out the result
    for ( int j=0; j < smooth.length; j++)
    {
        System.out.print(smooth[j] + " ");
    }

  }
} 