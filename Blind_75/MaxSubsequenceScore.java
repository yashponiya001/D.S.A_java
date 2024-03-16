// class Solution {
//     public long maxScore(int[] nums1, int[] nums2, int k) {
//approach 1
//     //   int n = nums1.length;
//     //     int[][] pairs = new int[n][2];
//     //     for (int i = 0; i < n; i++) {
//     //         pairs[i] = new int[] { nums2[i], nums1[i] };
//     //     }
//     //     Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
//     //     PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
//     //     long res = 0, totalSum = 0;
//     //     for (int[] pair : pairs) {
//     //         pq.add(pair[1]);
//     //         totalSum += pair[1];
//     //         if (pq.size() > k) {
//     //             totalSum -= pq.poll();
//     //         }
//     //         if (pq.size() == k) {
//     //             res = Math.max(res, totalSum * pair[0]);
//     //         }
//     //     }
//     //     return res;  


//Approach 2
//       int n = nums1.length;
//         int[][] pairs = new int[n][2];
//         for (int i = 0; i < n; ++i) {
//             pairs[i] = new int[]{nums1[i], nums2[i]};
//         }
//         Arrays.sort(pairs, (a, b) -> b[1] - a[1]);
        
//         // Use a min-heap to maintain the top k elements.
//         PriorityQueue<Integer> topKHeap = new PriorityQueue<>(k, (a, b) -> a - b);
//         long topKSum = 0;
//         for (int i = 0; i < k; ++i) {
//             topKSum += pairs[i][0];
//             topKHeap.add(pairs[i][0]); 
//                 }
        
//         // The score of the first k pairs.
//         long answer = topKSum * pairs[k - 1][1];
        
//         // Iterate over every nums2[i] as minimum from nums2.
//         for (int i = k; i < n; ++i) {
//             // Remove the smallest integer from the previous top k elements
//             // then ddd nums1[i] to the top k elements.
//             topKSum += pairs[i][0] - topKHeap.poll();
//             topKHeap.add(pairs[i][0]);
            
//             // Update answer as the maximum score.
//             answer = Math.max(answer, topKSum * pairs[i][1]);
//         }
        
//         return answer;
//     }
// }

//Approach 3


class Solution {
    // Nested Pair class
    class Pair {
        public int a, b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        Pair[] arrp = new Pair[n];
        
        // Create pairs from nums1 and nums2
        for (int i = 0; i < n; i++)
            arrp[i] = new Pair(nums1[i], nums2[i]);
        
        // Sort pairs in descending order of 'a'
        Arrays.sort(arrp, (p1, p2) -> -Integer.compare(p1.a, p2.a));
        
        // Create a priority queue to store pairs based on 'b'
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> Integer.compare(p1.b, p2.b));
        
        long sum = 0;
        
        // Select 'k' pairs with maximum 'a' values and add them to the priority queue
        for (int i = 0; i < k; i++) {
            sum += arrp[i].a;
            pq.add(arrp[i]);
        }
        
        // Calculate the initial maximum score
        long max = pq.peek().b * sum;
        
        // Process remaining pairs
        for (int i = k; i < n; i++) {
            if (pq.peek().b < arrp[i].b) {
                // Remove the pair with the minimum 'b' value
                sum -= (long) pq.remove().a;
                
                int min = arrp[i].b;
                
                // Get the minimum 'b' value among the remaining pairs
                if (pq.size() > 0)
                    min = Integer.min(pq.peek().b, min);
                
                // Add the current pair to the priority queue
                pq.add(arrp[i]);
                
                // Update the sum and calculate the maximum score
                sum += arrp[i].a;
                max = Long.max(max, min * sum);
            }
        }
        
        return max;
    }
}
