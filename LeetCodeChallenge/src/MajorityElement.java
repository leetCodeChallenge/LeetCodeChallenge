import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] numbers) {
        int value = -1;
        int count = 0;

        for (int i = 0; i < numbers.length; i++)
        {
            if (count== 0)
            {
                value = numbers[i];
                // reset the counter to 1
                count = 1;
            }

            else if (value == numbers[i]) {
                count++;
            }
            else {
                count--;
            }
        }

        return value;
    }
}
