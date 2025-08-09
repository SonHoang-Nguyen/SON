import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int [] arr = new int[n];
     int b;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    b = arr[j];
                    arr[j] = arr[i];
                    arr[i] = b;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


    }

}