package academy.samela.entendendoalgoritmos.capitulo1.binarysearch.domain;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            int guess = arr[middle];
            if (guess == target) {
                return middle;
            } else if (guess > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
