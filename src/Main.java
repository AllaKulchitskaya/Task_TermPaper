import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {21, 34, 74, 18, 15, 48, 53, 67, 64, 76};
        int[] newArray = rewriteArray(array);
        String result = Arrays.toString(newArray);
        System.out.println(result);
    }

    public static int[] rewriteArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i]++;
            }
        }
        return Arrays.copyOfRange(array, 3, 8);
    }
}
