import java.util.Scanner;
import java.io.*;

public class Panagram
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int[] letters = new int[26];
        boolean allLetters = true;
        System.out.println("Enter your string: ");
        String sentence = scan.nextLine();
        sentence = sentence.trim();
        sentence = sentence.toLowerCase();
        

        for(int i = 0; i < sentence.length();i++ ){
            if((int)sentence.charAt(i) != 32){
                letters[(int)sentence.charAt(i) - 97]++;
            }

        }
        for(int i = 0; i < 25; i++){
            if(letters[i] < 1){
                allLetters = false;
            }
        }

        if(allLetters){
            System.out.println("This is a panagram");
        } else{
            System.out.println("This is not a panagram");
        }
        
    }
}