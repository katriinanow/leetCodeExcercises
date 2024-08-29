// https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

    static int[] readInput(Scanner scanner) {
        String input = scanner.nextLine();
        String[] stringNums = input.split(",\\s*");

        List<Integer> numbersList = new ArrayList<>();
        for (String strNum : stringNums) {
            try {
                numbersList.add(Integer.parseInt(strNum));
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + strNum);
            }
        }

        return numbersList.stream().mapToInt(i -> i).toArray();
    }

    static void removeDuplicates(int[] nums) {
        int j = 1;
        if (nums.length > 0) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[j-1]) {
                    j++;
                    nums[j-1] = nums[i];
                }
            }
            for (int i = j; i < nums.length; i++) {
                nums[i] = -101;
            }
        }
        System.out.print(j + ", ");
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = readInput(scanner);
        scanner.close();

        removeDuplicates(nums);

    }
}
