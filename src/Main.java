public class Main {

    /*

    --- Print repeating even numbers in array. ---

     */
    public static void main(String[] args) {

        int[] list = {3, 2, 6, 5, 32, 3, 9, 6, 7, 20, 30, 1, 2, 5, 32};
        int[] duplicate = new int[list.length];

        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isValueSame(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        // print

        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }

    static boolean isValueSame(int[] arr, int value) {

        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


}
