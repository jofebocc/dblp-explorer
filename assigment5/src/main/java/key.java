import java.util.Scanner;

public class key {
    public static String readfromconsole(String s){
        System.out.println(s);
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        return input;
    }
}
