package questions.math;

public class ReverseNumber {

    // Time - O(LOG(N), Space - O(1)
    public static long solution(long number) {
        long reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }

        return reverseNumber;
    }
}
