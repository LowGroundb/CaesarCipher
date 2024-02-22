import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userInput = myObj.nextLine(); ;
        String encodedString = CaesarCipherEncoder.Encoder(userInput);
        System.out.println("Encoded string: " + encodedString);
        String dencodedString = CaesarCipherDecoder.Decoder(userInput);
        System.out.println("Encoded string: " + dencodedString);
    }
}
