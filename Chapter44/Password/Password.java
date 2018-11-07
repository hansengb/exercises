import java.util.Scanner;
public class Password{
    public static void main ( String[] args){
        Scanner scan = new Scanner(System.in);

        boolean password = false;
        boolean chars = false;
        boolean uplow = false;
        boolean digit = false;

        System.out.println("Enter your password:");
        String word = scan.nextLine();
        digit = checkDigit(word);
        uplow = checkCase(word);
        chars = checkChar(word);
        
        
        if(chars && uplow && digit){
            password = true;
        }
        if(password){
            System.out.println("Acceptable password");
        } else{
            System.out.println("That password is not acceptable");
        }
        

        

    }
    public static boolean checkDigit(String word){
        boolean digit = false;
        for(int i = 0;i < word.length(); i++){
            char letter = word.charAt(i);
            if(Character.isDigit(letter)){ 
                digit = true;   
            }
        }
        return digit;
    }
    public static boolean checkChar(String word){   
        if(word.length() >= 7){
            return true;
        } else{
            return false;
        }
    }
    public static boolean checkCase(String word){
        boolean uplow = false;
        boolean up = false;
        boolean low = false;
        for(int i = 0;i < word.length(); i++){
            char letter = word.charAt(i);
            if(Character.isUpperCase(letter)){
                up = true;
            } else if(Character.isLowerCase(letter)){
                low = true; 
            }
            if(up && low){
                uplow = true;
                
            }
            
            
        }
        return uplow;

    }
}