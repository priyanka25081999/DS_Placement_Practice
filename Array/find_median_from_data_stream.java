// Heap : Find Median from Data Stream
// Leetcode : https://leetcode.com/problems/find-median-from-data-stream/
// Time complexity to insert and delete in a heap : O(logn)
// Time complexity to get median from a heap : O(1)
// MUST REPEAT

class MedianFinder {
    // Left that is - > a Max Heap
    // Right that is -> a Min Heap
    // While inserting the element i am also keeping in mind the height of them both so that     
    // there size doesnot differ by more than 1 and in doing so making searching median in O(1)
    
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    
    public MedianFinder() {
        left = new PriorityQueue<Integer>(Collections.reverseOrder()); // maxheap
        right = new PriorityQueue<Integer>(); // minheap
    }
    
    public void addNum(int num) {
        int l = left.size();
        int r = right.size();

        if (l == 0 && r == 0) {
            left.add(num);
            return;
        }

        if (r == 0) {
            if (num >= left.peek()) {
                right.add(num);
                return;
            } else {
                right.add(left.poll());
                left.add(num);
                return;
            }

        }

        if (l == r) {
            if (num <= left.peek()) {
                left.add(num);
                return;
            }
            if (num >= right.peek()) {
                right.add(num);
                return;
            }
            left.add(num);
            return;
        }
        if (l > r) {
            if (num <= left.peek()) {
                right.add(left.poll());
                left.add(num);
                return;
            }
            if (num > left.peek() && num < right.peek()) {
                right.add(num);
                return;
            }
            if (num >= right.peek()) {
                right.add(num);
                return;
            }
        }

        if (r > l) {
            if (num <= left.peek()) {
                left.add(num);
                return;
            }
            if (num > left.peek() && num < right.peek()) {
                left.add(num);
                return;
            }
            if (num >= right.peek()) {
                left.add(right.poll());
                right.add(num);
                return;
            }

        }
    }
    
    public double findMedian() {
        int leftSize = left.size();
        int rightSize = right.size();

        double sum = 0;
        if (leftSize == rightSize) {
            sum = ((double) left.peek() + (double) right.peek()) / 2;
        } else if (leftSize > rightSize) {
            sum = left.peek();
        } else {
            sum = right.peek();
        }
        return sum;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
