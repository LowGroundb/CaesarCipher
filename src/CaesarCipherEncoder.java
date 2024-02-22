

public class CaesarCipherEncoder {
   
    static String Encoder(String input){
        StringBuilder output = new StringBuilder();
        for(int i =0;i<input.length();i++){
            if(input.charAt(i)==' '){
                output.append(' ');
            }
            else {
            char encodedChar = (char)(input.charAt(i) + 1);
            output.append(encodedChar);
            }
        }  
        return output.toString();
    }
   
}
