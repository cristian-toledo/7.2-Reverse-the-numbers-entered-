import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write 10 integers:");
        int[] reverse = new int[10];
        for (int i = 0;i < reverse.length;i++){
            reverse[i] = scanner.nextInt();
        }
        for (int i = reverse.length - 1; i >=0; i--){
            System.out.println(reverse[i]);
        }
    }
}