import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = S.nextInt();
        }

        if (n == 1) {  
            System.out.println(arr[0]);
            return;
        }

        for (int i = 0; i < n; i++) {
            if ((i == 0 && arr[i] >= arr[i + 1]) || 
                (i == n - 1 && arr[i] >= arr[i - 1]) || 
                (i > 0 && i < n - 1 && arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])) { 
                System.out.println(arr[i]);
                
            }
        }
        
    }
}
