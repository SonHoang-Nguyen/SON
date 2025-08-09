import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        String a = sc.nextLine();
        int p = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == c) {
                p++;
        }
    } System.out.println(p);
}
    }