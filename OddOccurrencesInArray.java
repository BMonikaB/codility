public class OddOccurrencesInArray {


    public static void main(String[] args) {

        int tab[] = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(tab));
    }

    public static int solution(int[] A) {
        int b = 0;

        for (int i : A) {

            b = b^i;
        }

        return b;
    }

}
