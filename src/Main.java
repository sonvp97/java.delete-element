import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 6, 7, 9, 1};
        int index_del = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to be deleted: ");
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++){
            if (number == arr[i]){
                index_del = i;
            }
        }
        for (int i = index_del; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
}