package lessons;

import java.util.ArrayList;


public class Main {
    static int getMax(int[] candies) {
        int max = Integer.MIN_VALUE;
        for (int i : candies) if (i > max) max = i;
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Boolean> result = new ArrayList<Boolean>(5);
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        for (int candy : candies) {
            if ((candy + extraCandies) >= getMax(candies))
                result.add(true);
            else result.add(false);
            String s = "a";
        }
    }
}