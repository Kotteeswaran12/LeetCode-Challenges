
import java.util.Arrays;

public class MoveZero {

    public static void main(String[] args) {

        int arr[] = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};

        System.out.println(Arrays.toString(moveZero1(arr)));
    }

    public static int[] moveZero1(int[] arr) {

        int i = 0;
        int j = i + 1;

        while (j < arr.length) {
            System.out.println("i : " + arr[i] + " , " + " J : " + arr[j]);

            if (arr[i] == 0 && arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            } else if (arr[i] != 0) {
                i++;
            }

            j++;

        }

        return arr;

    }

}
