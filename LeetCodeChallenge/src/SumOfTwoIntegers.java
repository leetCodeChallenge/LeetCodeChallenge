public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        //Input: a = 1, b = 2
        //Output: 3
        while (b != 0) {
            int tmp = (a & b) << 1;
            a = a ^ b;
            b = tmp;
        }
        return a;
    }
}
