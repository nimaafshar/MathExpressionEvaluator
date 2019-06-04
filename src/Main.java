import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
//        Expression expression = new Expression(a);
        /*
        Test Phase
         */
        Tokenizer tokenizer = new Tokenizer(a);
        try {
            ArrayList<String> tokens = tokenizer.tokenize();
            System.out.println(tokens);
        } catch (TokenizeException e) {
            System.out.println("not found any");
        }
    }
}
