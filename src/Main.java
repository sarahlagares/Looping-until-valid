import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Type a number between 50 and 300");
        Scanner scanner = new Scanner(System.in);
        Integer userInput = scanner.nextInt();

        Service validateUser = new Service();
        validateUser.checkUserInput(userInput);



    }


}