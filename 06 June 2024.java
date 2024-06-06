class Solution {
    long max_sum(int a[], int n) {
        long initialSum = 0; // Initial score
        long totalSum = 0; // Sum of all elements in the array
        
        // Calculate initialSum and totalSum
            for (int i = 0; i < n; i++) {
            initialSum += (long)i * a[i];
            totalSum += (long)a[i];
        }
        
        long max_sum = initialSum; // Start with initial score
        long currentSum = initialSum;
    
        // Try moving the first element to the end and calculate new scores
            for (int i = 1; i < n; i++) {
            currentSum = currentSum - totalSum + (long)n * a[i - 1];
            max_sum = Math.max(max_sum, currentSum);
        }
        return max_sum; // Return the highest score found
    }
}
