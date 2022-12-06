import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicRotation {


    public static void main(String[] args) {

        int tab[] = {3, 8, 9, 7, 6};
        int k = 3;

        int tab2[] = solution(tab, k);

        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]);
        }

    }

    public static int[] solution(int[] A, int K) {

        int lastElement = A[A.length - 1];
        int newTab[] = new int[A.length + 1];
        int finalTab[] = new int[A.length];

        for (int j = 0; j < K; j++) {
            for (int i = 0; i < A.length; i++) {
                newTab[i + 1] = A[i];
            }

            lastElement = A[A.length - 1];
            newTab[0] = lastElement;
            finalTab = Arrays.copyOf(newTab, newTab.length - 1);

        }
        return finalTab;
    }

}
