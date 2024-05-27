import java.util.*;

class MaximumInStack_II {
    private int max;
    private Stack<Integer> s;

    public MaximumInStack_II() {
        s = new Stack<>();
        max = Integer.MIN_VALUE;
    }

    public void push(int val) {
        if (s.isEmpty()) {
            s.push(0); // Pushing 0 when stack is empty
            max = val; // Update max
        } else {
            s.push(val - max); // Pushing the difference between val and current max
            if (val > max) { // If val is greater than max, update max
                max = val;
            }
        }
    }

    public void pop() {
        if (s.isEmpty()) {
            return;
        }

        int poppedValue = s.pop();
        if (poppedValue > 0) { // If popped value is positive, restore previous max
            max = max - poppedValue;
        }
    }

    public int top() {
        if (s.isEmpty()) {
            return -1;
        }

        int topValue = s.peek();
        if (topValue > 0) { // If top value is positive, return max
            return max;
        } else {
            return topValue + max; // Otherwise, add max to get the original value
        }
    }

    public int getMax() {
        if (s.isEmpty()) {
            return -1;
        }
        return max;
    }
}

/*
In this implementation:

When the stack is empty, we push 0 onto the stack to indicate that it's empty. We also update the maximum value to be the value being pushed.
For subsequent pushes, we push the difference between the pushed value and the current maximum onto the stack.
When popping a value, if the popped value is positive, it indicates that it was encoding the maximum value. We restore the previous maximum by subtracting it from the current maximum.
When accessing the top value, if the top value is positive, it indicates that it's encoding the maximum value. In such cases, we return the current maximum. Otherwise, we add the current maximum to the top value to retrieve the original value.
This implementation ensures that the MaxStack supports finding the maximum element in constant time while using only 𝑂(1) extra space complexity.

*/
