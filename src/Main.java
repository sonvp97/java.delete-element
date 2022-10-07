import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 3, 5, 3, 3, 9, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to be deleted: ");
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++){
            if (number == arr[i]){
                Delete(arr,i);
                i--;
                arr[arr.length - 1] = 0;
            }
        }

        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
    public static void Delete (int[] array,int x){
        for (int j = x; j < array.length - 1 ; j++){
            array[j] = array[j+1];
        }
    }
}