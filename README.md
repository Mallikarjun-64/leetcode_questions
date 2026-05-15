# LeetCode Solutions Repository

This folder contains various LeetCode problem solutions implemented in Java. Each file corresponds to a specific problem, named according to the problem title and ID.

## 🚀 How to Use These Solutions

You have two ways to run these programs:

### Option 1: Create a `Solution.java` file
1. Create a new file named `Solution.java`.
2. Copy the method logic from the problem file (e.g., `TwoSum_1.java`) into `Solution.java`.
3. Add a `main` method to pass values and test the logic.

### Option 2: Run the existing file directly
1. Open the problem file.
2. **Rename the class** inside the file to match the filename exactly.
3. Add a `main` method inside that class to test it.

---

## 📝 Example Walkthrough (using Two Sum)

### Method 1: Creating a new `Solution.java`
If you want to create a fresh file for testing:

```java
// File: Solution.java
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int[] res = sol.twoSum(nums, 9);
        System.out.println("Indices: [" + res[0] + ", " + res[1] + "]");
    }
}
```

### Method 2: Renaming Class in existing file
If you are using `TwoSum_1.java`:

1. **Ensure the class name matches the filename:**
   ```java
   // Inside TwoSum_1.java
   class TwoSum_1 { // <--- Must match 'TwoSum_1.java'
       public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }


       public static void main(String[] args) {
           TwoSum_1 obj = new TwoSum_1();
           int[] res = obj.twoSum(new int[]{2, 7}, 9);
           System.out.println("Result: " + res[0] + ", " + res[1]);
       }
   }
   ```

2. **Compile and Run:**
   ```bash
   javac TwoSum_1.java
   java TwoSum_1
   ```

---
*Happy Coding with mallikarjun!* 🎯
