public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = new int[10];

        // a. Populate the array using do-while loop
        int i = 0, num = 1;
        do {
            arr[i] = num * num;
            num++;
            i++;
        } while (i < 10);

        // b. Sum of odd numbers using while loop (skip even numbers)
        int sum = 0, index = 0;
        while (index < 10) {
            if (arr[index] == 81) break; // c. Break when 81 is encountered
            if (arr[index] % 2 != 0) {
                sum += arr[index];
            }
            index++;
        }

        System.out.println("Sum of odd numbers before 81: " + sum);
    }
}
