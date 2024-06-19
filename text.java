import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution1 {

    /**
     * Finds the top k most frequent elements in the given array.
     * 
     * @param nums the input array of integers
     * @param k    the number of top frequent elements to find
     * @return an array of the top k most frequent elements
     * 
     *         Time Complexity: O(nlog(k))
     *         - Building the frequency map takes O(n).
     *         - Adding elements to the priority queue and maintaining its size
     *         takes O(log(k)) time for each element, resulting in O(nlog(k)) for n
     *         elements.
     * 
     *         Space Complexity: O(n)
     *         - The frequency map and the priority queue together require O(n)
     *         space.
     */
    public int[] topKFrequent(int[] nums, int k) {
        // Array to store the result
        int[] arr = new int[k];

        // HashMap to store the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        // Populate the frequency map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // PriorityQueue (min-heap) to keep track of the top k elements
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue() // Comparator to sort by frequency in ascending order
        );

        // Add entries from the frequency map to the priority queue
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
            // Maintain the size of the priority queue to be at most k
            if (pq.size() > k) {
                pq.poll(); // Remove the element with the smallest frequency
            }
        }

        // Extract the top k elements from the priority queue
        int i = k;
        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey(); // Place elements in the result array from the end to the beginning
        }

        return arr; // Return the result array
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] result = solution.topKFrequent(nums, k);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
