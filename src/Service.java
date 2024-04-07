import java.util.Scanner;

public class Service {
    void checkUserInput (Integer userInput){
        Scanner scanner = new Scanner(System.in);

        while (userInput <= 50 || userInput >= 300) {
            System.out.println("Oops, that number wasn't between 50 and 300, try again:");
            userInput = scanner.nextInt();
        }
        System.out.println("The number you typed in was: " + userInput);
    }
}
