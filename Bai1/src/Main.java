import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            if(arr[i] == a) {
                System.out.println(i);
            }
        }

    }
}