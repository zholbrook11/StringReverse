import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("#".repeat(43));
            System.out.println("Enter the string you would like to reverse:");
            System.out.println("#".repeat(43));

            String userInput = scanner.next();

            if (userInput.equalsIgnoreCase("exit")){
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            
            String reversed = "";
            for (int i = userInput.length() - 1; i >= 0; i --){
                char character = userInput.charAt(i);
                reversed += character;
            }
            System.out.println("The reversed string is : " + reversed);
        }
        scanner.close();
    }
}
