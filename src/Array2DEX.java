import java.util.Arrays;

/**
 * Created by Matt on 7/5/2017.
 */
public class Array2DEX {

    public static void main(String[] args) {

        String[][] arr = new String[7][7];

        arr[0][0] = "Antonella";

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
