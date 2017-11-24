public class ex16 {

    public static void main(String[] args) {
//        String arr = "$abcd$$";

//        System.out.println(isDollarChain(arr, 7));

    }

    public static boolean isDollarChain(char[] arr, int chainLength) {
        for (int i = 0; i < arr.length - chainLength; ++i) {

            if (arr[i] == '$' &&
                    arr[i + chainLength - 1] == '&' &&
                    arr[(i + chainLength - 1) / 2] == '$') {
                return true;
            }
        }

        return false;
    }
}
