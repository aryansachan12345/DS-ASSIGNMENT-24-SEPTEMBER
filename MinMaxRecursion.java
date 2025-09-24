public class MinMaxRecursion {

    // Recursive function to find min and max
    public static int[] findMinMax(int[] arr, int start, int end) {
        // Base case: Only one element
        if (start == end) {
            return new int[]{arr[start], arr[start]}; // {min, max}
        }

        // Base case: Two elements
        if (end == start + 1) {
            if (arr[start] < arr[end]) {
                return new int[]{arr[start], arr[end]};
            } else {
                return new int[]{arr[end], arr[start]};
            }
        }

        // Divide array into two halves
        int mid = (start + end) / 2;
        int[] left = findMinMax(arr, start, mid);
        int[] right = findMinMax(arr, mid + 1, end);

        // Combine results
        int min = Math.min(left[0], right[0]);
        int max = Math.max(left[1], right[1]);

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 5, 6, -1, 10, 11};

        int[] result = findMinMax(arr, 0, arr.length - 1);

        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);
    }
}
