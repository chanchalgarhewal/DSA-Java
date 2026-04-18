import java.util.Scanner;
public class MoveZeroes {
    static void moveZeroes(int arr[]) {
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }

        while (pos < arr.length) {
            arr[pos] = 0;
            pos++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};

        System.out.print("Before: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        moveZeroes(arr);

        System.out.print("\nAfter:  ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}