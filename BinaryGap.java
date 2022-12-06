public class BinaryGap {


    public static void main(String[] args) {
        System.out.println(solution(1041));
    }

    public static int solution(int N){

        String numToBin = Integer.toBinaryString(N);
        int countZero =0;
        int sum =0;

        for (int i=0; i<numToBin.length(); i++){

            if(numToBin.charAt(i)=='0'){
                countZero++;
            }
            else if(numToBin.charAt(i)=='1'){
                if(countZero>sum){
                    sum = countZero;
                    countZero=0;
                }

            }

        }
        return sum;
    }

}
